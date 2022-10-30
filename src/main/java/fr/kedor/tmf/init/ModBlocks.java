package fr.kedor.tmf.init;

import net.fabricmc.fabric.api.mininglevel.v1.FabricMineableTags;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class ModBlocks {

    public static final Block TITANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(4f,15f));

    public static void RegisterAll(){

    }
}
