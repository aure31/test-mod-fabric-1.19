package fr.kedor.tmf;

import fr.kedor.tmf.init.block.ModBlocks;
import fr.kedor.tmf.init.item.ModItems;
import fr.kedor.tmf.init.world.feature.ModConfiguredFeatures;
import fr.kedor.tmf.init.world.gen.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TMF implements ModInitializer {

    public static final String MOD_ID = "tmf";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModConfiguredFeatures.registerConfigureFeatures();

        ModItems.registerModItem();
        ModBlocks.registerModBlocks();

        ModOreGeneration.generatedOres();

    }
}
