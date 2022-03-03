package potionstudios.byg.world.biome;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.RegistryOps;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeResolver;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.biome.Biomes;
import potionstudios.byg.common.world.biome.BYGBiomes;
import potionstudios.byg.common.world.biome.LayersBiomeData;
import potionstudios.byg.common.world.biome.end.BYGEndBiomeSource;

public class BYGFabricEndBiomeSource extends BYGEndBiomeSource {

    public static final Codec<BYGFabricEndBiomeSource> CODEC = RecordCodecBuilder.create((builder) -> {
        return builder.group(RegistryOps.retrieveRegistry(Registry.BIOME_REGISTRY).forGetter((bygEndBiomeSource) -> {
            return bygEndBiomeSource.getBiomeRegistry();
        }), Codec.LONG.fieldOf("seed").stable().forGetter((bygEndBiomeSource) -> {
            return bygEndBiomeSource.getSeed();
        }), LayersBiomeData.CODEC.fieldOf("islandLayersBiomeData").stable().forGetter((bygEndBiomeSource) -> {
            return bygEndBiomeSource.getIslandLayersBiomeData();
        }), LayersBiomeData.CODEC.fieldOf("voidLayersBiomeData").stable().forGetter((bygEndBiomeSource) -> {
            return bygEndBiomeSource.getVoidLayersBiomeData();
        }), LayersBiomeData.CODEC.fieldOf("skyLayersBiomeData").stable().forGetter((bygEndBiomeSource) -> {
            return bygEndBiomeSource.getSkyLayersBiomeData();
        })).apply(builder, builder.stable(BYGFabricEndBiomeSource::new));
    });

    public BYGFabricEndBiomeSource(Registry<Biome> biomeRegistry, long seed, LayersBiomeData islandLayersBiomeData, LayersBiomeData voidLayersBiomeData, LayersBiomeData skyLayersBiomeData) {
        super(biomeRegistry, seed, islandLayersBiomeData, voidLayersBiomeData, skyLayersBiomeData);
    }

    @Override
    public BiomeResolver getIslandBiomeResolver(Registry<Biome> biomeRegistry, long seed, LayersBiomeData islandLayersBiomeData) {
//        Area layers = createLayers(biomeRegistry, seed, islandLayersBiomeData.biomeWeights(), islandLayersBiomeData.biomeSize());
        return (x, y, z, sampler) -> biomeRegistry.getHolderOrThrow(BYGBiomes.IMPARIUS_GROVE); //TODO: biomeRegistry.getHolder(layers.get(x, z)).orElseThrow();
    }

    @Override
    public BiomeResolver getVoidBiomeResolver(Registry<Biome> biomeRegistry, long seed, LayersBiomeData voidLayersBiomeData) {
//        Area layers = createLayers(biomeRegistry, seed, voidLayersBiomeData.biomeWeights(), voidLayersBiomeData.biomeSize());
        return (x, y, z, sampler) -> biomeRegistry.getHolderOrThrow(Biomes.SMALL_END_ISLANDS); //TODO: biomeRegistry.getHolder(layers.get(x, z)).orElseThrow();
    }

    @Override
    public BiomeResolver getSkyBiomeResolver(Registry<Biome> biomeRegistry, long seed, LayersBiomeData skyLayersBiomeData) {
//        Area layers = createLayers(biomeRegistry, seed, skyLayersBiomeData.biomeWeights(), skyLayersBiomeData.biomeSize());
        return (x, y, z, sampler) -> biomeRegistry.getHolderOrThrow(BYGBiomes.VISCAL_ISLES); //TODO: biomeRegistry.getHolder(layers.get(x, z)).orElseThrow();
    }

    @Override
    protected Codec<? extends BiomeSource> codec() {
        return CODEC;
    }

    @Override
    public BiomeSource withSeed(long l) {
        return new BYGFabricEndBiomeSource(getBiomeRegistry(), l, getIslandLayersBiomeData(), getVoidLayersBiomeData(), getSkyLayersBiomeData());
    }
}