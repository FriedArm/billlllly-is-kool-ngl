
package net.mcreator.billysmod.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.properties.IntegerProperty;


import java.util.List;
import java.util.Collections;

public class WireBlock extends Block {


	public WireBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.GRAVEL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {
		return true;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

/*
  	public static final PropertyInteger POWER = PropertyInteger.create("power", 0, 15);
	@Override
	public void updateTick(Level world, BlockPos pos, IBlockState state, Random rand) {
		world.setBlockState(pos, blockstate.getBlock().getDefaultState().withProperty(POWER, power), 3);

	    int power = world.getRedstonePowerFromNeighbors(pos);
	    world.setBlockState(pos, this.getDefaultState().withProperty(POWER, power), 3);
	}
	*/

}
