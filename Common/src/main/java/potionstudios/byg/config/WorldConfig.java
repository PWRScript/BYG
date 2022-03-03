package potionstudios.byg.config;

import java.nio.file.Path;

import static potionstudios.byg.BYG.CONFIG_PATH;

public class WorldConfig {

    public static WorldConfig INSTANCE = null;
    private final CommentedConfigBuilder configHelper;
//    public final int overworldBiomeRegionWeight;

//    public final int netherBiomeSize;
//    public final boolean controlNether;
//
//    public final int endBiomeSize;
//    public final int voidBiomeSize;
//    public final boolean controlEnd;
//    public final String ametrineSpawns;
//    public final String buddingAmetrineSpawns;
//    public final String theriumSpawns;
//    public final String pendoriteSpawns;
//    public final String emeralditeSpawns;
//
//    public final String rockyStoneSpawns;
//    public final String scoriaSpawns;
//    public final String soapStoneSpawns;

    public WorldConfig(Path path) {
        this.configHelper = new CommentedConfigBuilder(path);
//        this.overworldBiomeRegionWeight = this.configHelper.addNumber("This value determines BYG's terrablender biome region weight!", "overworldBiomeRegionWeight", 4, 0, 25);

//        CommentedConfigBuilder netherSubConfig = new CommentedConfigBuilder(this.configHelper.getValue("nether") != null ? this.configHelper.getValue("nether") : CommentedConfig.inMemory());
//        this.netherBiomeSize = netherSubConfig.addNumber("Nether Biome Size\nDefault: 3", "netherBiomeSize", 3, 1, 10);
//        this.controlNether = netherSubConfig.add("Does BYG control The Nether?\nThis only applies when making NEW worlds!\nIs not guaranteed to work in specific world types.\nYou can find more info here in regards to specific world types: https://github.com/CorgiTaco/BYG/wiki/Enabling-BYG-Nether-&-End-Biomes\nFor existing worlds, follow the steps listed here: https://wiki.griefed.de/SCP/edit-world.", "controlNether", true);
//        this.configHelper.addSubConfig("Nether related settings", "nether", netherSubConfig);
//
//        CommentedConfigBuilder endSubConfig = new CommentedConfigBuilder(this.configHelper.getValue("end") != null ? this.configHelper.getValue("end") : CommentedConfig.inMemory());
//        this.endBiomeSize = endSubConfig.addNumber("End Biome Size\nDefault: 3", "endBiomeSize", 3, 1, 10);
//        this.voidBiomeSize = endSubConfig.addNumber("Void Biome Size\nDefault: 2", "voidBiomeSize", 2, 1, 10);
//        this.controlEnd = endSubConfig.add("Does BYG control The End?\nThis only applies when making NEW worlds!\nIs not guaranteed to work in specific world types.\nYou can find more info here in regards to specific world types: https://github.com/CorgiTaco/BYG/wiki/Enabling-BYG-Nether-&-End-Biomes\nFor existing worlds, follow the steps listed here: https://wiki.griefed.de/SCP/edit-world.", "controlEnd", true);
//        this.configHelper.addSubConfig("End related settings", "end", endSubConfig);
//
//        CommentedConfigBuilder oreSubConfig = new CommentedConfigBuilder(this.configHelper.getValue("ores") != null ? this.configHelper.getValue("ores") : CommentedConfig.inMemory());
//        this.ametrineSpawns = oreSubConfig.add("What biome(s) does Ametrine spawn in? Default: \"byg:shattered_viscal_isles\".", "ametrineSpawns", "byg:shattered_viscal_isles");
//        this.buddingAmetrineSpawns = oreSubConfig.add("What biome(s) does Budding Ametrine spawn in? Default: \"byg:shattered_viscal_isles\".", "buddingAmetrineSpawns", "byg:shattered_viscal_isles");
//        this.theriumSpawns = oreSubConfig.add("What biome(s) does Therium spawn in? Default: \"byg#THE_END\".", "theriumSpawns", "byg#THEEND");
//        this.pendoriteSpawns = oreSubConfig.add("What biome(s) does Pendorite spawn in? Default: \"byg:embur_bog\".", "pendoriteSpawns", "byg:embur_bog");
//        this.emeralditeSpawns = oreSubConfig.add("What biome(s) does Emeraldite spawn in? Default: \"byg:wailing_garth\".", "emeralditeSpawns", "byg:wailing_garth");
//
//        this.configHelper.addSubConfig("BYG uses a prefix system for its ore spawns.\n Prefix Guide:\n \"#\" - Biome category representable.\n \"$\" - Biome dictionary representable.\n \",\" - Creates a new condition, separate from the previous.\n \"ALL\" - Spawn in all biomes(no condition).\n \"!\" - Negates/flips/does the reverse of the condition.\n \"\" - No prefix serves as a biome ID OR Mod ID representable.\n\n Here are a few examples:\n1. \"byg#THE_END, $OCEAN\" would mean that the ore may spawn in biomes with the name space \"byg\" AND in the \"END\" biome category, OR all biomes in the \"OCEAN\" dictionary.\n2. \"byg:guiana_shield, #MESA\" would mean that the ore may spawn in the \"byg:guiana_shield\" OR all biomes in the \"MESA\" category.\n3. \"byg#ICY$MOUNTAIN\" would mean that the ore may only spawn in biomes from byg in the \"ICY\" category and \"MOUNTAIN\" dictionary type.\n4. \"!byg#DESERT\" would mean that the ore may only spawn in biomes that are NOT from byg and NOT in the \"DESERT\" category.\n5. \"ALL\", spawn everywhere. \n6. \"\" Don't spawn anywhere.", "ores", oreSubConfig);
//
//        CommentedConfigBuilder stoneSubConfig = new CommentedConfigBuilder(this.configHelper.getValue("stones") != null ? this.configHelper.getValue("stones") : CommentedConfig.inMemory());
//        this.rockyStoneSpawns = stoneSubConfig.add("What biome(s) does Rocky Stone spawn in? Default: \"!#THEEND#NETHER\".", "rockyStoneSpawns", "!#THEEND#NETHER");
//        this.scoriaSpawns = stoneSubConfig.add("What biome(s) does Scoria Stone spawn in? Default: \"!#THEEND#NETHER\".", "scoriaStoneSpawns", "!#THEEND#NETHER");
//        this.soapStoneSpawns = stoneSubConfig.add("What biome(s) does Soap Stone spawn in? Default: \"!#THEEND#NETHER\".", "soapStoneSpawns", "!#THEEND#NETHER");
//        this.configHelper.addSubConfig("See the explanation for ores for configuring stones.", "stones", stoneSubConfig);


        this.configHelper.build();
    }

    public static WorldConfig worldConfig(boolean refreshConfig) {
        if (INSTANCE == null || refreshConfig) {
            INSTANCE = new WorldConfig(CONFIG_PATH.resolve("world.toml"));
        }
        return INSTANCE;
    }

    public static WorldConfig worldConfig() {
        return worldConfig(false);
    }
}
