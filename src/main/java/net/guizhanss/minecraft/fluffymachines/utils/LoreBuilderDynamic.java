package net.guizhanss.minecraft.fluffymachines.utils;

import dev.j3fftw.extrautils.utils.Utils;

public final class LoreBuilderDynamic {
    private LoreBuilderDynamic() {}

    public static String powerBuffer(double power) {
        return power(power, " 可存储");
    }

    public static String powerPerTick(double power) {
        return power(Utils.perTickToPerSecond(power), "/s");
    }

    public static String power(double power, String suffix) {
        return "&8⇨ &e⚡ &7" + Utils.powerFormatAndFadeDecimals(power) + " J" + suffix;
    }
}
