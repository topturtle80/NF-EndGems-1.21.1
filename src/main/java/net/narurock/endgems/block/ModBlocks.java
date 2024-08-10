package net.narurock.endgems.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.narurock.endgems.EndGems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EndGems.MOD_ID);

    public static final DeferredBlock<Block> END_GEM_BLOCK = BLOCKS.register("end_gem_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(20f).sound(SoundType.GLASS)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
