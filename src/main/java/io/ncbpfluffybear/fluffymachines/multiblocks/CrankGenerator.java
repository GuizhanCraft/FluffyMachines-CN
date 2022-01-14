package io.ncbpfluffybear.fluffymachines.multiblocks;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetProvider;
import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
import io.ncbpfluffybear.fluffymachines.utils.FluffyItems;
import io.ncbpfluffybear.fluffymachines.utils.Utils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import net.guizhanss.guizhanlib.common.RateLimit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class CrankGenerator extends MultiBlockMachine implements EnergyNetProvider {

    public static final int RATE = 16;
    public static final int CAPACITY = 64;

    public static int RATE_LIMIT = 0;

    private RateLimit<Location> rateLimit;

    public CrankGenerator(ItemGroup category, SlimefunItemStack item) {
        super(category, item, new ItemStack[] {null, null, null, null, new ItemStack(Material.LEVER), null, null,
            FluffyItems.GENERATOR_CORE, null}, BlockFace.SELF);

        if (RATE_LIMIT > 0) {
            this.rateLimit = new RateLimit<>(1000L, RATE_LIMIT);
        }
    }

    @Override
    public int getGeneratedOutput(@Nonnull Location location, @Nonnull Config config) {
        return 0;
    }

    @Override
    public int getCapacity() {
        return CAPACITY;
    }

    public void onInteract(Player p, Block b) {
        String id;
        Block core = b.getRelative(BlockFace.DOWN);
        if (BlockStorage.hasBlockInfo(core)) {
            id = BlockStorage.getLocationInfo(core.getLocation(), "id");

            if (id.equals("GENERATOR_CORE")) {
                if (RATE_LIMIT > 0) {
                    if (!this.rateLimit.add(core.getLocation()))
                        return;
                }
                addCharge(core.getLocation(), RATE);
                p.playSound(p.getLocation(), Sound.BLOCK_PISTON_EXTEND, 0.5F, 0.5F);

            } else {
                Utils.send(p, "&c缺少发电机核心");
            }
        } else {
            Utils.send(p, "&c缺少发电机核心");
        }
    }

}
