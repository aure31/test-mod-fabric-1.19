package fr.kedor.tmf.init.world.feature;

import fr.kedor.tmf.TMF;
import fr.kedor.tmf.init.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_TITANIUM_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.TINANIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TINANIUM_ORE.getDefaultState())
    );

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TITANIUM_ORE =
            ConfiguredFeatures.register("titanium_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_TITANIUM_ORE, 9));

    public static void registerConfigureFeatures(){
        TMF.LOGGER.debug("Registering the registerConfigureFeatures for " + TMF.MOD_ID);
    }
}
