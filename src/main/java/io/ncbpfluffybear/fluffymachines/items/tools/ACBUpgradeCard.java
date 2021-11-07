package io.ncbpfluffybear.fluffymachines.items.tools;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemHandler;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.SimpleSlimefunItem;
import io.ncbpfluffybear.fluffymachines.utils.FluffyItems;
import io.ncbpfluffybear.fluffymachines.utils.Utils;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.Optional;

public class ACBUpgradeCard extends SimpleSlimefunItem<ItemHandler> {

    public ACBUpgradeCard(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Nonnull
    @Override
    public ItemHandler getItemHandler() {
        return (ItemUseHandler) e -> {
            // Prevent offhand right clicks
            if (e.getHand() != EquipmentSlot.HAND) {
                return;
            }

            // Block exists
            Optional<Block> optB = e.getClickedBlock();

            if (!optB.isPresent()) {
                return;
            }

            // Prevent menu opening and interactions
            e.cancel();

            Block b = optB.get();
            SlimefunItem sfItem = BlockStorage.check(b);
            Player p = e.getPlayer();
            ItemStack card = p.getInventory().getItemInMainHand();

            // Make sure the block is an ACB
            if (sfItem == null || sfItem != FluffyItems.ADVANCED_CHARGING_BENCH.getItem()) {
                Utils.send(e.getPlayer(), "&c只能对进阶充电台使用");
                return;
            }

            // Increment the tier by 1
            int tier = Integer.parseInt(BlockStorage.getLocationInfo(b.getLocation(), "tier"));
            if (tier == 100) {
                Utils.send(e.getPlayer(), "&c这个进阶充电台已经到达最大等级: 100");
                return;
            }
            tier++;
            BlockStorage.addBlockInfo(b.getLocation(), "tier", String.valueOf(tier));

            // Remove a card
            card.setAmount(card.getAmount() - 1);

            Utils.send(e.getPlayer(), "&a进阶充电台已升级! &e等级: " + tier);
        };
    }
}
