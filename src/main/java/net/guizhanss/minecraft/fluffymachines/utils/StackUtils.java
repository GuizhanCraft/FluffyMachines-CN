package net.guizhanss.minecraft.fluffymachines.utils;

import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.cscorelib2.inventory.ItemUtils;
import me.mrCookieSlime.Slimefun.cscorelib2.reflection.ReflectionUtils;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Function;

/**
 * Collection of utils for modifying ItemStacks and getting their ids
 * Reduced for getting item names only
 *
 * @author Mooy1
 */
@UtilityClass
public final class StackUtils {

    private static final Function<Object, String> TO_STRING;
    private static final Function<Object, Object> GET_NAME;
    private static final Function<ItemStack, Object> COPY;


    public static String getDisplayName(@Nonnull ItemStack item) {
        return TO_STRING.apply(GET_NAME.apply(COPY.apply(item)));
    }

    public static String getDisplayName(@Nonnull ItemStack item, @Nonnull ItemMeta meta) {
        if (meta.hasDisplayName()) {
            return meta.getDisplayName();
        }
        return getDisplayName(item);
    }

    static {
        Function<Object, String> toString;
        Function<Object, Object> getName;
        Function<ItemStack, Object> copy;
        if (ReflectionUtils.isUnitTestEnvironment()) {
            toString = obj -> "TESTING";
            getName = obj -> obj;
            copy = obj -> obj;
        } else try {
            toString = lambdaItemUtilsMethod("toString");
            getName = lambdaItemUtilsMethod("getName");
            copy = lambdaItemUtilsMethod("copy");
        } catch (Throwable e) {
            e.printStackTrace();
            toString = obj -> "ERROR";
            getName = obj -> obj;
            copy = obj -> obj;
        }
        TO_STRING = toString;
        GET_NAME = getName;
        COPY = copy;
    }

    @SuppressWarnings("unchecked")
    private static <T, V> Function<T, V> lambdaItemUtilsMethod(String name) throws Throwable {
        // Reflect to access the reflected method
        Field field = ItemUtils.class.getDeclaredField(name);
        field.setAccessible(true);
        Method method = (Method) field.get(null);
        method.setAccessible(true);

        // Create lambda from method
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle handle = lookup.unreflect(method);
        return (Function<T, V>) LambdaMetafactory.metafactory(
                lookup, "apply", MethodType.methodType(Function.class),
                MethodType.methodType(Object.class, Object.class),
                handle, handle.type()
        ).getTarget().invokeExact();
    }

}
