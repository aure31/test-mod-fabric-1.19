package fr.kedor.tmf.init.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class JumpyBlock extends Block {
    public JumpyBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        super.onLandedUpon(world, state, pos, entity, fallDistance * 0f);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof LivingEntity LivingEntity){
            if(!LivingEntity.isInSneakingPose()) {
                LivingEntity.addVelocity(0, 1.5, 0);
            }
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
