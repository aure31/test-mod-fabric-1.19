package fr.kedor.tmf.init.item;

import fr.kedor.tmf.TMF;
import fr.kedor.tmf.init.item.custom.EightBallItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot" ,
            new Item(new Item.Settings().group(ModItemsGroup.MY_GROUP).fireproof()));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium",
            new Item(new Item.Settings().group(ModItemsGroup.MY_GROUP).fireproof()));

    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new Item.Settings().group(ModItemsGroup.MY_GROUP).maxCount(1)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM,new Identifier(TMF.MOD_ID,name),item);
    }

    public static void registerModItem() {
        TMF.LOGGER.debug("Registring Mod Item for " + TMF.MOD_ID);
    }
}
