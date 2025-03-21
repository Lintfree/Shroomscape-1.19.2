package lintfree.shroomscape.datagen

import lintfree.shroomscape.Shroomscape.ID
import lintfree.shroomscape.block.ModBlocks
import lintfree.shroomscape.block.ModBlocks.BROWN_SHROOM_SLAB
import lintfree.shroomscape.block.ModBlocks.BROWN_SHROOM_STAIRS
import lintfree.shroomscape.block.ModBlocks.RED_SHROOM_SLAB
import lintfree.shroomscape.block.ModBlocks.RED_SHROOM_STAIRS
import lintfree.shroomscape.block.ModBlocks.SHROOM_STEM_SLAB
import lintfree.shroomscape.block.ModBlocks.SHROOM_STEM_STAIRS
import net.minecraft.data.DataGenerator
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks.BROWN_MUSHROOM_BLOCK
import net.minecraft.world.level.block.Blocks.MUSHROOM_STEM
import net.minecraft.world.level.block.Blocks.RED_MUSHROOM_BLOCK
import net.minecraft.world.level.block.ButtonBlock
import net.minecraft.world.level.block.FenceBlock
import net.minecraft.world.level.block.FenceGateBlock
import net.minecraft.world.level.block.PressurePlateBlock
import net.minecraft.world.level.block.SlabBlock
import net.minecraft.world.level.block.StairBlock
import net.minecraft.world.level.block.WallBlock
import net.minecraftforge.client.model.generators.BlockStateProvider
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile
import net.minecraftforge.common.data.ExistingFileHelper
import net.minecraftforge.registries.RegistryObject


class ShroomBlockStates(gen: DataGenerator, helper: ExistingFileHelper) : BlockStateProvider(gen, ID, helper) {
	override fun registerStatesAndModels() {
		stairsBlock(RED_SHROOM_STAIRS.get() as StairBlock, blockTexture(RED_MUSHROOM_BLOCK))
		stairsBlock(BROWN_SHROOM_STAIRS.get() as StairBlock, blockTexture(BROWN_MUSHROOM_BLOCK))
		stairsBlock(SHROOM_STEM_STAIRS.get() as StairBlock?, blockTexture(MUSHROOM_STEM))
		blockItem(RED_SHROOM_STAIRS)
		blockItem(BROWN_SHROOM_STAIRS)
		blockItem(SHROOM_STEM_STAIRS)

		slabBlock(RED_SHROOM_SLAB.get() as SlabBlock, blockTexture(RED_MUSHROOM_BLOCK), blockTexture(RED_MUSHROOM_BLOCK))
		slabBlock(BROWN_SHROOM_SLAB.get() as SlabBlock, blockTexture(BROWN_MUSHROOM_BLOCK), blockTexture(BROWN_MUSHROOM_BLOCK))
		slabBlock(SHROOM_STEM_SLAB.get() as SlabBlock, blockTexture(MUSHROOM_STEM), blockTexture(MUSHROOM_STEM))
		blockItem(RED_SHROOM_SLAB)
		blockItem(BROWN_SHROOM_SLAB)
		blockItem(SHROOM_STEM_SLAB)

		pressurePlateBlock(ModBlocks.RED_SHROOM_PRESSURE_PLATE.get() as PressurePlateBlock, blockTexture(RED_MUSHROOM_BLOCK))
		pressurePlateBlock(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE.get() as PressurePlateBlock, blockTexture(BROWN_MUSHROOM_BLOCK))
		pressurePlateBlock(ModBlocks.SHROOM_STEM_PRESSURE_PLATE.get() as PressurePlateBlock, blockTexture(MUSHROOM_STEM))
		blockItem(ModBlocks.RED_SHROOM_PRESSURE_PLATE)
		blockItem(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE)
		blockItem(ModBlocks.SHROOM_STEM_PRESSURE_PLATE)

		buttonBlock(ModBlocks.RED_SHROOM_BUTTON.get() as ButtonBlock, blockTexture(RED_MUSHROOM_BLOCK))
		buttonBlock(ModBlocks.BROWN_SHROOM_BUTTON.get() as ButtonBlock, blockTexture(BROWN_MUSHROOM_BLOCK))
		buttonBlock(ModBlocks.SHROOM_STEM_BUTTON.get() as ButtonBlock, blockTexture(MUSHROOM_STEM))

		fenceBlock(ModBlocks.RED_SHROOM_FENCE.get() as FenceBlock, blockTexture(RED_MUSHROOM_BLOCK))
		fenceBlock(ModBlocks.BROWN_SHROOM_FENCE.get() as FenceBlock, blockTexture(BROWN_MUSHROOM_BLOCK))
		fenceBlock(ModBlocks.SHROOM_STEM_FENCE.get() as FenceBlock, blockTexture(MUSHROOM_STEM))

		fenceGateBlock(ModBlocks.RED_SHROOM_FENCE_GATE.get() as FenceGateBlock, blockTexture(RED_MUSHROOM_BLOCK))
		fenceGateBlock(ModBlocks.BROWN_SHROOM_FENCE_GATE.get() as FenceGateBlock, blockTexture(BROWN_MUSHROOM_BLOCK))
		fenceGateBlock(ModBlocks.SHROOM_STEM_FENCE_GATE.get() as FenceGateBlock, blockTexture(MUSHROOM_STEM))
		blockItem(ModBlocks.RED_SHROOM_FENCE_GATE)
		blockItem(ModBlocks.BROWN_SHROOM_FENCE_GATE)
		blockItem(ModBlocks.SHROOM_STEM_FENCE_GATE)

		wallBlock(ModBlocks.RED_SHROOM_WALL.get() as WallBlock, blockTexture(RED_MUSHROOM_BLOCK))
		wallBlock(ModBlocks.BROWN_SHROOM_WALL.get() as WallBlock, blockTexture(BROWN_MUSHROOM_BLOCK))
		wallBlock(ModBlocks.SHROOM_STEM_WALL.get() as WallBlock, blockTexture(MUSHROOM_STEM))

		doorBlockWithRenderType(ModBlocks.RED_SHROOM_DOOR.get(), modLoc("block/red_shroom_door_bottom"), modLoc("block/red_shroom_door_top"), ("cutout"))
		doorBlockWithRenderType( ModBlocks.BROWN_SHROOM_DOOR.get(), modLoc("block/brown_shroom_door_bottom"), modLoc( "block/brown_shroom_door_top"), ("cutout"))
		doorBlockWithRenderType( ModBlocks.SHROOM_STEM_DOOR.get(), modLoc("block/shroom_stem_door_bottom"), modLoc( "block/shroom_stem_door_top"), ("cutout"))

		trapdoorBlockWithRenderType(ModBlocks.RED_SHROOM_TRAPDOOR.get(), modLoc("block/red_shroom_trapdoor"), true, "cutout")
		trapdoorBlockWithRenderType(ModBlocks.BROWN_SHROOM_TRAPDOOR.get(), modLoc("block/brown_shroom_trapdoor"), true, "cutout")
		trapdoorBlockWithRenderType(ModBlocks.SHROOM_STEM_TRAPDOOR.get(), modLoc("block/shroom_stem_trapdoor"), true, "cutout")
}

	fun blockItem(blockRegistryObject: RegistryObject<Block>) {
		simpleBlockItem(blockRegistryObject.get(), UncheckedModelFile("shroom_craft:block/" + blockRegistryObject.id.path))
	}
}