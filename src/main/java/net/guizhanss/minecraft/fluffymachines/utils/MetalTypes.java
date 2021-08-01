package net.guizhanss.minecraft.fluffymachines.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MetalTypes {
    public static String get(String type) {
        switch (type.toUpperCase()) {
            case "IRON":
                return "铁";
            case "GOLD":
                return "金";
            case "TIN":
                return "锡";
            case "COPPER":
                return "铜";
            case "SILVER":
                return "银";
            case "ALUMINUM":
                return "铝";
            case "LEAD":
                return "铅";
            case "ZINC":
                return "锌";
            case "MAGNESIUM":
                return "镁";
            default:
                return "未知";
        }
    }
}
