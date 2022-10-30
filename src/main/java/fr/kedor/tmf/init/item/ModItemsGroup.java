package fr.kedor.tmf.init.item;

import fr.kedor.tmf.TMF;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemsGroup {
    public static final ItemGroup MY_GROUP = FabricItemGroupBuilder.build(
            new Identifier(TMF.MOD_ID,"mygroup"), () -> new ItemStack(ModItems.TITANIUM_INGOT));
}
