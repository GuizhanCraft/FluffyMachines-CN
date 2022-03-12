package io.ncbpfluffybear.fluffymachines.utils;

import dev.j3fftw.extrautils.utils.LoreBuilderDynamic;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;
import io.ncbpfluffybear.fluffymachines.items.Barrel;
import io.ncbpfluffybear.fluffymachines.items.FireproofRune;
import io.ncbpfluffybear.fluffymachines.items.tools.FluffyWrench;
import io.ncbpfluffybear.fluffymachines.items.tools.PortableCharger;
import io.ncbpfluffybear.fluffymachines.machines.AdvancedAutoDisenchanter;
import io.ncbpfluffybear.fluffymachines.machines.AdvancedChargingBench;
import io.ncbpfluffybear.fluffymachines.machines.AutoAncientAltar;
import io.ncbpfluffybear.fluffymachines.machines.AutoCraftingTable;
import io.ncbpfluffybear.fluffymachines.machines.AutoTableSaw;
import io.ncbpfluffybear.fluffymachines.machines.BackpackLoader;
import io.ncbpfluffybear.fluffymachines.machines.BackpackUnloader;
import io.ncbpfluffybear.fluffymachines.machines.ElectricDustFabricator;
import io.ncbpfluffybear.fluffymachines.machines.ElectricDustRecycler;
import io.ncbpfluffybear.fluffymachines.machines.WaterSprinkler;
import io.ncbpfluffybear.fluffymachines.multiblocks.CrankGenerator;
import io.ncbpfluffybear.fluffymachines.objects.AutoCrafter;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

/**
 * Specifies all plugin items
 */
public class FluffyItems {

    private FluffyItems() {
    }

    // Barrels
    public static final SlimefunItemStack SMALL_FLUFFY_BARREL = new SlimefunItemStack("SMALL_FLUFFY_BARREL",
            Material.BEEHIVE,
            "&e小型蓬松桶",
            "",
            "&7可存储大量物品"
            "",
            "&b可存储: &e" + Barrel.SMALL_BARREL_SIZE + "个物品"
    );

    public static final SlimefunItemStack MEDIUM_FLUFFY_BARREL = new SlimefunItemStack("MEDIUM_FLUFFY_BARREL",
            Material.BARREL,
            "&6中型蓬松桶",
            "",
            "&7可存储大量物品",
            "",
            "&b可存储: &e" + Barrel.MEDIUM_BARREL_SIZE + "个物品"
    );

    public static final SlimefunItemStack BIG_FLUFFY_BARREL = new SlimefunItemStack("BIG_FLUFFY_BARREL",
            Material.SMOKER,
            "&b大型蓬松桶",
            "",
            "&7可存储大量物品",
            "",
            "&b可存储: &e" + Barrel.BIG_BARREL_SIZE + "个物品"
    );

    public static final SlimefunItemStack LARGE_FLUFFY_BARREL = new SlimefunItemStack("LARGE_FLUFFY_BARREL",
            Material.LODESTONE,
            "&a超大型蓬松桶",
            "",
            "&7可存储大量物品",
            "",
            "&b可存储: &e" + Barrel.LARGE_BARREL_SIZE + "个物品"
    );

    public static final SlimefunItemStack MASSIVE_FLUFFY_BARREL = new SlimefunItemStack("MASSIVE_FLUFFY_BARREL",
            Material.CRYING_OBSIDIAN,
            "&5巨型蓬松桶",
            "",
            "&7可存储大量物品",
            "",
            "&b可存储: &e" + Barrel.MASSIVE_BARREL_SIZE + "个物品"
    );

    public static final SlimefunItemStack BOTTOMLESS_FLUFFY_BARREL = new SlimefunItemStack("BOTTOMLESS_FLUFFY_BARREL",
            Material.RESPAWN_ANCHOR,
            "&c无底蓬松桶",
            "",
            "&7可存储大量物品",
            "",
            "&b可存储: &e" + Barrel.BOTTOMLESS_BARREL_SIZE + "个物品"
    );

    // Portable Chargers
    public static final SlimefunItemStack SMALL_PORTABLE_CHARGER = new SlimefunItemStack("SMALL_PORTABLE_CHARGER",
            Material.BRICK,
            "&e小型便携式充电器",
            "",
            "&7一个便携的充电器，可以给手中的物品/装备充电",
            "",
            "&e充电速度: &7" + PortableCharger.Type.SMALL.chargeSpeed + " J/s",
            LoreBuilder.powerCharged(0, PortableCharger.Type.SMALL.chargeCapacity)
    );

    public static final SlimefunItemStack MEDIUM_PORTABLE_CHARGER = new SlimefunItemStack("MEDIUM_PORTABLE_CHARGER",
            Material.IRON_INGOT,
            "&e中型便携式充电器",
            "",
            "&7一个便携的充电器，可以给手中的物品/装备充电",
            "",
            "&e充电速度: &7" + PortableCharger.Type.MEDIUM.chargeSpeed + " J/s",
            LoreBuilder.powerCharged(0, PortableCharger.Type.MEDIUM.chargeCapacity)
    );

    public static final SlimefunItemStack BIG_PORTABLE_CHARGER = new SlimefunItemStack("BIG_PORTABLE_CHARGER",
            Material.GOLD_INGOT,
            "&a大型便携式充电器",
            "",
            "&7一个便携的充电器，可以给手中的物品/装备充电",
            "",
            "&e充电速度: &7" + PortableCharger.Type.BIG.chargeSpeed + " J/s",
            LoreBuilder.powerCharged(0, PortableCharger.Type.BIG.chargeCapacity)
    );

    public static final SlimefunItemStack LARGE_PORTABLE_CHARGER = new SlimefunItemStack("LARGE_PORTABLE_CHARGER",
            Material.NETHER_BRICK,
            "&2超大型便携式充电器",
            "",
            "&7一个便携的充电器，可以给手中的物品/装备充电",
            "",
            "&e充电速度: &7" + PortableCharger.Type.LARGE.chargeSpeed + " J/s",
            LoreBuilder.powerCharged(0, PortableCharger.Type.LARGE.chargeCapacity)
    );

    public static final SlimefunItemStack CARBONADO_PORTABLE_CHARGER = new SlimefunItemStack(
            "CARBONADO_PORTABLE_CHARGER",
            Material.NETHERITE_INGOT,
            "&4黑金刚石便携式充电器",
            "",
            "&7一个便携的充电器，可以给手中的物品/装备充电",
            "",
            "&e充电速度: &7" + PortableCharger.Type.CARBONADO.chargeSpeed + " J/s",
            LoreBuilder.powerCharged(0, PortableCharger.Type.CARBONADO.chargeCapacity)
    );

    // Items
    public static final SlimefunItemStack ANCIENT_BOOK = new SlimefunItemStack("ANCIENT_BOOK",
            Material.BOOK,
            "&6古代书籍",
            "",
            "&7在&c进阶自动祛魔机&7中使用",
            "",
            "&6&o凝聚了远古时期的强大能量"
    );
    public static final SlimefunItemStack HELICOPTER_HAT = new SlimefunItemStack("HELICOPTER_HAT",
            Material.LEATHER_HELMET, Color.AQUA,
            "&1直升机帽",
            "",
            "&7起飞~~~~~~~",
            "",
            "&e蹲下&7使用"
    );
    public static final SlimefunItemStack WATERING_CAN = new SlimefunItemStack("WATERING_CAN",
            "6484da45301625dee79ae29ff513efa583f1ed838033f20db80963cedf8aeb0e",
            "&b水壶",
            "",
            "&f给植物浇水",
            "",
            "&7> &e右键点击&a水源来灌满水壶",
            "&7> &e右键点击&a植物来加速生长",
            "&7> &e右键点击&a向玩家泼水使其减速",
            "",
            "&a剩余使用次数: &e0"
    );
    public static final SlimefunItemStack ENDER_CHEST_EXTRACTION_NODE = new SlimefunItemStack(
            "ENDER_CHEST_EXTRACTION_NODE",
            "e707c7f6c3a056a377d4120028405fdd09acfcd5ae804bfde0f653be866afe39",
            "&6末影箱提取节点",
            "",
            "&7将此节点放置在&5末影箱&7的一侧",
            "",
            "&7将会从&5末影箱&7中",
            "&7提取物品到后面的&6箱子&7内"
    );
    public static final SlimefunItemStack ENDER_CHEST_INSERTION_NODE = new SlimefunItemStack(
            "ENDER_CHEST_INSERTION_NODE",
            "7e5dc50c0186d53381d9430a2eff4c38f816b8791890c7471ffdb65ba202bc5",
            "&b末影箱输入节点",
            "",
            "&7将此节点放置在&5末影箱&7的一侧",
            "",
            "&7将会从后面的&6箱子&7中",
            "&7放置物品到&5末影箱&7内"
    );
    // Machines
    public static final SlimefunItemStack AUTO_CRAFTING_TABLE = new SlimefunItemStack("AUTO_CRAFTING_TABLE",
            Material.CRAFTING_TABLE,
            "&6自动工作台",
            "",
            "&7自动合成&f原版&7配方",
            "",
            LoreBuilderDynamic.powerBuffer(AutoCraftingTable.CAPACITY),
            LoreBuilderDynamic.powerPerSecond(AutoCraftingTable.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_ANCIENT_ALTAR = new SlimefunItemStack("AUTO_ANCIENT_ALTAR",
            Material.ENCHANTING_TABLE,
            "&5自动古代祭坛",
            "",
            "&7自动合成&5古代祭坛&7配方",
            "",
            LoreBuilderDynamic.powerBuffer(AutoAncientAltar.CAPACITY),
            LoreBuilderDynamic.powerPerSecond(AutoAncientAltar.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_TABLE_SAW = new SlimefunItemStack("AUTO_TABLE_SAW",
            Material.STONECUTTER,
            "&6自动台锯",
            "",
            "&7自动合成&6台锯&7配方",
            "",
            LoreBuilderDynamic.powerBuffer(AutoTableSaw.CAPACITY),
            LoreBuilderDynamic.powerPerSecond(AutoTableSaw.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack WATER_SPRINKER = new SlimefunItemStack("WATER_SPRINKLER",
            "d6b13d69d1929dcf8edf99f3901415217c6a567d3a6ead12f75a4de3ed835e85",
            "&b洒水机",
            "",
            "&7加速生长附近的作物",
            "",
            LoreBuilderDynamic.powerBuffer(WaterSprinkler.CAPACITY),
            LoreBuilderDynamic.powerPerSecond(WaterSprinkler.ENERGY_CONSUMPTION) + " 每株植物"
    );
    public static final SlimefunItemStack GENERATOR_CORE = new SlimefunItemStack("GENERATOR_CORE",
            Material.BLAST_FURNACE,
            "&7发电机核心",
            "",
            "&7多方块结构发电机的部件"
    );
    public static final SlimefunItemStack CRANK_GENERATOR = new SlimefunItemStack("CRANK_GENERATOR",
            Material.BLAST_FURNACE,
            "&7手摇式发电机",
            "",
            "&e右键点击&7拉杆发电",
            "",
            LoreBuilderDynamic.power(CrankGenerator.RATE, " 每次使用"),
            LoreBuilderDynamic.powerBuffer(CrankGenerator.CAPACITY),
            "",
            Utils.multiBlockWarning()
    );

    public static final SlimefunItemStack FOUNDRY = new SlimefunItemStack("FOUNDRY",
            Material.BLAST_FURNACE,
            "&c铸造厂",
            "",
            "&e可存储并铸造锭和矿粉",
            "&7可存储 138,240 个矿粉",
            "",
            Utils.multiBlockWarning()
    );

    public static final SlimefunItemStack BACKPACK_UNLOADER = new SlimefunItemStack("BACKPACK_UNLOADER",
            Material.BROWN_STAINED_GLASS,
            "&e背包卸载机",
            "",
            "&7从背包中卸载物品到物品栏中",
            "",
            LoreBuilderDynamic.powerBuffer(BackpackUnloader.CAPACITY),
            LoreBuilderDynamic.powerPerSecond(BackpackUnloader.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack BACKPACK_LOADER = new SlimefunItemStack("BACKPACK_LOADER",
            Material.ORANGE_STAINED_GLASS,
            "&e背包装载机",
            "",
            "&7从物品栏中移动物品到背包里",
            "",
            LoreBuilderDynamic.powerBuffer(BackpackLoader.CAPACITY),
            LoreBuilderDynamic.powerPerSecond(BackpackLoader.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack UPGRADED_EXPLOSIVE_PICKAXE = new SlimefunItemStack(
            "UPGRADED_EXPLOSIVE_PICKAXE",
            Material.DIAMOND_PICKAXE,
            "&e&l升级版爆炸镐",
            "",
            "&7可挖掘5x5的范围"
    );
    public static final SlimefunItemStack UPGRADED_EXPLOSIVE_SHOVEL = new SlimefunItemStack("UPGRADED_EXPLOSIVE_SHOVEL",
            Material.DIAMOND_SHOVEL,
            "&e&l升级版爆炸铲",
            "",
            "&7可挖掘5x5的范围"
    );
    public static final SlimefunItemStack FIREPROOF_RUNE = new SlimefunItemStack(
            "FIREPROOF_RUNE",
            new ColoredFireworkStar(Color.fromRGB(255, 165, 0),
                    "&7古代符文 &8&l[&c&l防火&8&l]",
                    "",
                    "&e把符文丢向一个丢出的物品",
                    "&e使其&c防火",
                    ""
            ));
    public static final SlimefunItemStack SUPERHEATED_FURNACE = new SlimefunItemStack("SUPERHEATED_FURNACE",
            Material.BLAST_FURNACE,
            "&c过热熔炉",
            "",
            "&7多方块结构铸造厂的部件",
            "&c只能用于铸造厂",
            "&c不要使用爆炸工具破坏!"
    );
    public static final SlimefunItemStack AUTO_MAGIC_WORKBENCH = new SlimefunItemStack("AUTO_MAGIC_WORKBENCH",
            Material.BOOKSHELF,
            "&6自动魔法工作台",
            "",
            "&7自动合成&6魔法工作台&7配方",
            "",
            LoreBuilderDynamic.powerBuffer(AutoCrafter.CAPACITY),
            LoreBuilderDynamic.powerPerSecond(AutoCrafter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_ARMOR_FORGE = new SlimefunItemStack("AUTO_ARMOR_FORGE",
            Material.SMITHING_TABLE,
            "&7自动盔甲锻造台",
            "",
            "&7自动合成&e盔甲锻造台&7配方",
            "",
            LoreBuilderDynamic.powerBuffer(AutoCrafter.CAPACITY),
            LoreBuilderDynamic.powerPerSecond(AutoCrafter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack ADVANCED_AUTO_DISENCHANTER = new SlimefunItemStack(
            "ADVANCED_AUTO_DISENCHANTER",
            Material.ENCHANTING_TABLE,
            "&c进阶自动祛魔机",
            "",
            "&7从物品上移除一种附魔",
            "&7需要使用&6古代书籍",
            "",
            LoreBuilderDynamic.powerBuffer(AdvancedAutoDisenchanter.CAPACITY),
            LoreBuilderDynamic.powerPerSecond(AdvancedAutoDisenchanter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack SCYTHE = new SlimefunItemStack("SCYTHE",
            Material.IRON_HOE,
            "&e长镰刀",
            "",
            "&7一次性破坏5格农作物"
    );
    public static final SlimefunItemStack UPGRADED_LUMBER_AXE = new SlimefunItemStack("UPGRADED_LUMBER_AXE",
            Material.DIAMOND_AXE,
            "&6&l升级版伐木斧",
            "",
            "&7可以砍倒整棵大型树木"
    );
    public static final SlimefunItemStack DOLLY = new SlimefunItemStack("DOLLY",
            Material.MINECART,
            "&b运输车",
            "",
            "&7右键点击箱子把它拿起来",
            "",
            "&7ID: <ID>"
    );

    public static final SlimefunItemStack WARP_PAD = new SlimefunItemStack("WARP_PAD",
            Material.SMOKER,
            "&6传送装置",
            "",
            "&7在方块上&e蹲下&7传送到目的地",
            "",
            "&7使用&7传送装置配置器&7来连接传送装置"
    );

    public static final SlimefunItemStack WARP_PAD_CONFIGURATOR = new SlimefunItemStack("WARP_PAD_CONFIGURATOR",
            Material.BLAZE_ROD,
            "&6传送装置配置器",
            "",
            "&eShift + 右键点击&7传送装置以设置目的地",
            "&e右键点击&7传送装置以设置出发地",
            "",
            "&e连接到坐标: &7无"
    );

    public static final SlimefunItemStack ELECTRIC_DUST_FABRICATOR = new SlimefunItemStack("ELECTRIC_DUST_FABRICATOR",
            Material.BLAST_FURNACE,
            "&6电力矿粉制造机",
            "",
            "&7磨石机,淘金机,洗矿机三合一",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(10),
            LoreBuilderDynamic.powerBuffer(ElectricDustFabricator.CAPACITY),
            LoreBuilderDynamic.powerPerSecond(ElectricDustFabricator.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack ELECTRIC_DUST_RECYCLER = new SlimefunItemStack("ELECTRIC_DUST_RECYCLER",
            Material.IRON_BLOCK,
            "&f电力矿粉回收机",
            "",
            "&7将矿粉回收为筛矿",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilderDynamic.powerBuffer(ElectricDustRecycler.CAPACITY),
            LoreBuilderDynamic.powerPerSecond(ElectricDustRecycler.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack ALTERNATE_ELEVATOR_PLATE = new SlimefunItemStack("ALTERNATE_ELEVATOR_PLATE",
            Material.POLISHED_BLACKSTONE_PRESSURE_PLATE,
            "&3备用电梯板",
            "",
            "&f在每一层放置电梯板",
            "&f你就能在每一层之间传送.",
            "",
            "&e右键电梯板 &7为此层命名",
            "&7与电梯板没有区别"
    );

    public static final SlimefunItemStack FLUFFY_WRENCH = new SlimefunItemStack("FLUFFY_WRENCH",
            FluffyWrench.Wrench.DEFAULT.getMaterial(),
            "&6蓬松扳手",
            "",
            "&7用于快速移除 Slimefun",
            "&7货运/电容/机器",
            "",
            "&e左键&7/&e右键点击&7使用"
    );

    public static final SlimefunItemStack REINFORCED_FLUFFY_WRENCH =
            new SlimefunItemStack("REINFORCED_FLUFFY_WRENCH", FluffyWrench.Wrench.REINFORCED.getMaterial(),
                    "&b强化蓬松扳手",
                    "",
                    "&7用于快速移除 Slimefun",
                    "&7货运/电容/机器",
                    "",
                    "&e左键&7/&e右键点击&7使用"
            );

    public static final SlimefunItemStack CARBONADO_FLUFFY_WRENCH =
            new SlimefunItemStack("CARBONADO_FLUFFY_WRENCH", FluffyWrench.Wrench.CARBONADO.getMaterial(),
                    "&7黑金刚石蓬松扳手",
                    "",
                    "&7用于快速移除 Slimefun",
                    "&7货运/电容/机器",
                    "",
                    "&e左键&7/&e右键点击&7使用",
                    "",
                    LoreBuilder.powerCharged(0, FluffyWrench.Wrench.CARBONADO.getMaxCharge())
            );

    public static final SlimefunItemStack PAXEL = new SlimefunItemStack("PAXEL",
            Material.DIAMOND_PICKAXE,
            "&b多功能工具",
            "",
            "&7镐、斧、铲三合一工具"
    );

    public static final SlimefunItemStack ADVANCED_CHARGING_BENCH = new SlimefunItemStack(
            "ADVANCED_CHARGING_BENCH",
            Material.SMITHING_TABLE,
            "&c进阶充电台",
            "",
            "&7给物品充电",
            "&7可以用&6进阶充电台升级卡&7升级"
    );

    public static final SlimefunItemStack ACB_UPGRADE_CARD = new SlimefunItemStack(
            "ACB_UPGRADE_CARD",
            Material.PAPER,
            "&6进阶充电台升级卡",
            "",
            "&e右键点击&c进阶充电台&7以升级",
            "",
            "&6充电速度 &a+" + AdvancedChargingBench.CHARGE + "J",
            "&6可存储 &a+" + AdvancedChargingBench.CAPACITY + "J",
            "&6能量消耗 &c+" + AdvancedChargingBench.ENERGY_CONSUMPTION + "J"
    );

    public static final SlimefunItemStack CARGO_MANIPULATOR = new SlimefunItemStack("CARGO_MANIPULATOR",
            Material.SEA_PICKLE,
            "&9货运配置器",
            "",
            "&e右键点击&7复制货运节点配置",
            "&e左键点击&7应用货运节点设置",
            "&eShift+右键点击&7清除节点数据"
    );

    public static final SlimefunItemStack EXP_DISPENSER = new SlimefunItemStack("EXP_DISPENSER",
            Material.DISPENSER,
            "&a经验发射器",
            "",
            "&7右键点击可以获得发射器中",
            "&7以及发射器面对的蓬松桶中",
            "&7所有经验瓶的经验",
            "",
            Utils.multiBlockWarning()
    );


    private static final Enchantment glowEnchant = Enchantment.getByKey(Constants.GLOW_ENCHANT);

    static {
        FireproofRune.setFireproof(FIREPROOF_RUNE);
        SMALL_PORTABLE_CHARGER.addEnchantment(glowEnchant, 1);
        MEDIUM_PORTABLE_CHARGER.addEnchantment(glowEnchant, 1);
        BIG_PORTABLE_CHARGER.addEnchantment(glowEnchant, 1);
        LARGE_PORTABLE_CHARGER.addEnchantment(glowEnchant, 1);
        CARBONADO_PORTABLE_CHARGER.addEnchantment(glowEnchant, 1);
    }
}
