package fr.kedor.tmf.init;

import fr.kedor.tmf.TMF;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item TITANIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS).fireproof());
    public static final Item RAW_TITANIUM = new Item(new Item.Settings().group(ItemGroup.MATERIALS).fireproof());

    public static void registerAll() {
        Registry.register(Registry.ITEM, new Identifier(TMF.MOD_ID,"titanium_ingot"), TITANIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(TMF.MOD_ID,"raw_titanium"), RAW_TITANIUM);

    }
}
