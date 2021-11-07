package io.ncbpfluffybear.fluffymachines.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.ncbpfluffybear.fluffymachines.objects.AutoCrafter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class AutoMagicWorkbench extends AutoCrafter {

    public AutoMagicWorkbench(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&6自动魔法工作台", Material.BOOKSHELF, "&6Magic Workbench", RecipeType.MAGIC_WORKBENCH);
    }
}
