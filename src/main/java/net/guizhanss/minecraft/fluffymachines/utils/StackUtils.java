package net.guizhanss.minecraft.fluffymachines.utils;

import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.cscorelib2.inventory.ItemUtils;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@UtilityClass
public final class StackUtils {
    private static Method COPY;
    private static Method GET_NAME;
    private static Method TO_STRING;

    static {
        try {
            Field field = ItemUtils.class.getDeclaredField("copy");
            field.setAccessible(true);
            COPY = (Method) field.get(null);
            COPY.setAccessible(true);
            field = ItemUtils.class.getDeclaredField("getName");
            field.setAccessible(true);
            GET_NAME = (Method) field.get(null);
            GET_NAME.setAccessible(true);
            field = ItemUtils.class.getDeclaredField("toString");
            field.setAccessible(true);
            TO_STRING = (Method) field.get(null);
            TO_STRING.setAccessible(true);
        } catch (Exception ignored) {
            // MockBukkit
        }
    }

    public static String getInternalName(@Nonnull ItemStack item) {
        try {
            return ChatColor.WHITE + (String) TO_STRING.invoke(GET_NAME.invoke(COPY.invoke(null, item)));
        } catch (Exception e) {
            return ChatColor.RED + "ERROR";
        }
    }

    public static String getDisplayName(@Nonnull ItemStack item, @Nonnull ItemMeta meta) {
        if (meta.hasDisplayName()) {
            return meta.getDisplayName();
        }
        return getInternalName(item);
    }
}
