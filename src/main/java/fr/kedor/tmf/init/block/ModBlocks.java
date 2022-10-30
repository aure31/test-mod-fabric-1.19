package fr.kedor.tmf.init.block;

import fr.kedor.tmf.TMF;
import fr.kedor.tmf.init.block.custom.JumpyBlock;
import fr.kedor.tmf.init.block.custom.ManualLampBlock;
import fr.kedor.tmf.init.item.ModItemsGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.mininglevel.v1.FabricMineableTags;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.sound.Sound;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    // block qui son enregistré
    public static final Block TINANIUM_BLOCK = registerBlock("titanium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemsGroup.MY_GROUP);

    public static final Block TINANIUM_ORE = registerBlock("titanium_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
            UniformIntProvider.create(3,7)), ModItemsGroup.MY_GROUP);

    public static final Block DEEPSLATE_TINANIUM_ORE = registerBlock("deepslate_titanium_ore",
            new OreBlock(FabricBlockSettings.of(new Material(MapColor.DEEPSLATE_GRAY,false,true,
                    false,false,false,false,
                    PistonBehavior.BLOCK)).strength(4f).requiresTool(), UniformIntProvider.create(3,7)),
                    ModItemsGroup.MY_GROUP);

    public static final Block JUMPY_BLOCK = registerBlock("jumpy_block",
            new JumpyBlock(FabricBlockSettings.of(new Material(MapColor.OAK_TAN,false,true,
                    false,false,true,false,
                    PistonBehavior.IGNORE)).strength(2f).sounds(BlockSoundGroup.WOOD)),ModItemsGroup.MY_GROUP);

    public static final Block MANUAL_LAMP = registerBlock("manual_lamp",
            new ManualLampBlock(FabricBlockSettings.of(Material.GLASS).strength(1f).sounds(BlockSoundGroup.GLASS).
                    luminance(state -> state.get(ManualLampBlock.LIT) ? 15 : 0)), ModItemsGroup.MY_GROUP);


    // methode d'enregistrement des block
    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TMF.MOD_ID, name),block);
    }

    //methode d'enregistrement des Item de block
    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(TMF.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks(){
        TMF.LOGGER.debug("Registering ModBlocks for " + TMF.MOD_ID);
    }
}
