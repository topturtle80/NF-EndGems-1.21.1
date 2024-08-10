package net.narurock.endgems.item;


import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.narurock.endgems.EndGems;
import net.narurock.endgems.block.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.narurock.endgems.armor.ModArmor.END_ARMOR;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EndGems.MOD_ID);

    public static final DeferredItem<Item> MAPPLITE_INGOT = ITEMS.register("mapplite_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_MAPPLITE = ITEMS.register("raw_mapplite",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> END_GEM = ITEMS.register("end_gem",() -> new Item(new Item.Properties()));
    public static final Supplier<BlockItem> END_GEM_BLOCK = ITEMS.registerSimpleBlockItem("end_gem_block", ModBlocks.END_GEM_BLOCK, new Item.Properties());

    public static final Supplier<ArmorItem> END_HELMET = ITEMS.register("end_helmet", () -> new ArmorItem(END_ARMOR, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final Supplier<ArmorItem> END_CHESTPLATE = ITEMS.register("end_chestplate", () -> new ArmorItem(END_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final Supplier<ArmorItem> END_LEGGINGS = ITEMS.register("end_leggings", () -> new ArmorItem(END_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final Supplier<ArmorItem> END_BOOTS = ITEMS.register("end_boots", () -> new ArmorItem(END_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
