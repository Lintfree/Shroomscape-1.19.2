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
import net.minecraft.world.level.block.Blocks.*
import net.minecraftforge.client.model.generators.BlockStateProvider
import net.minecraftforge.common.data.ExistingFileHelper


class ShroomBlockStates(gen: DataGenerator, helper: ExistingFileHelper) : BlockStateProvider(gen, ID, helper) {
	override fun registerStatesAndModels() {
		stairsBlock(RED_SHROOM_STAIRS.get(), blockTexture(RED_MUSHROOM_BLOCK))
		stairsBlock(BROWN_SHROOM_STAIRS.get(), blockTexture(BROWN_MUSHROOM_BLOCK))
		stairsBlock(SHROOM_STEM_STAIRS.get(), blockTexture(MUSHROOM_STEM))
//		blockItem(RED_SHROOM_STAIRS)
//		blockItem(BROWN_SHROOM_STAIRS)
//		blockItem(SHROOM_STEM_STAIRS)

		slabBlock(RED_SHROOM_SLAB.get(), blockTexture(RED_MUSHROOM_BLOCK), blockTexture(RED_MUSHROOM_BLOCK))
		slabBlock(BROWN_SHROOM_SLAB.get(), blockTexture(BROWN_MUSHROOM_BLOCK), blockTexture(BROWN_MUSHROOM_BLOCK))
		slabBlock(SHROOM_STEM_SLAB.get(), blockTexture(MUSHROOM_STEM), blockTexture(MUSHROOM_STEM))
//		blockItem(RED_SHROOM_SLAB)
//		blockItem(BROWN_SHROOM_SLAB)
//		blockItem(SHROOM_STEM_SLAB)

		pressurePlateBlock(ModBlocks.RED_SHROOM_PRESSURE_PLATE.get(), blockTexture(RED_MUSHROOM_BLOCK))
		pressurePlateBlock(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE.get(), blockTexture(BROWN_MUSHROOM_BLOCK))
		pressurePlateBlock(ModBlocks.SHROOM_STEM_PRESSURE_PLATE.get(), blockTexture(MUSHROOM_STEM))
//		blockItem(ModBlocks.RED_SHROOM_PRESSURE_PLATE)
//		blockItem(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE)
//		blockItem(ModBlocks.SHROOM_STEM_PRESSURE_PLATE)

		buttonBlock(ModBlocks.RED_SHROOM_BUTTON.get(), blockTexture(RED_MUSHROOM_BLOCK))
		buttonBlock(ModBlocks.BROWN_SHROOM_BUTTON.get(), blockTexture(BROWN_MUSHROOM_BLOCK))
		buttonBlock(ModBlocks.SHROOM_STEM_BUTTON.get(), blockTexture(MUSHROOM_STEM))

		fenceBlock(ModBlocks.RED_SHROOM_FENCE.get(), blockTexture(RED_MUSHROOM_BLOCK))
		fenceBlock(ModBlocks.BROWN_SHROOM_FENCE.get(), blockTexture(BROWN_MUSHROOM_BLOCK))
		fenceBlock(ModBlocks.SHROOM_STEM_FENCE.get(), blockTexture(MUSHROOM_STEM))

		fenceGateBlock(ModBlocks.RED_SHROOM_FENCE_GATE.get(), blockTexture(RED_MUSHROOM_BLOCK))
		fenceGateBlock(ModBlocks.BROWN_SHROOM_FENCE_GATE.get(), blockTexture(BROWN_MUSHROOM_BLOCK))
		fenceGateBlock(ModBlocks.SHROOM_STEM_FENCE_GATE.get(), blockTexture(MUSHROOM_STEM))
//		blockItem(ModBlocks.RED_SHROOM_FENCE_GATE)
//		blockItem(ModBlocks.BROWN_SHROOM_FENCE_GATE)
//		blockItem(ModBlocks.SHROOM_STEM_FENCE_GATE)

		wallBlock(ModBlocks.RED_SHROOM_WALL.get(), blockTexture(RED_MUSHROOM_BLOCK))
		wallBlock(ModBlocks.BROWN_SHROOM_WALL.get(), blockTexture(BROWN_MUSHROOM_BLOCK))
		wallBlock(ModBlocks.SHROOM_STEM_WALL.get(), blockTexture(MUSHROOM_STEM))

		doorBlockWithRenderType(ModBlocks.RED_SHROOM_DOOR.get(), modLoc("block/red_shroom_door_bottom"), modLoc("block/red_shroom_door_top"), ("cutout"))
		doorBlockWithRenderType( ModBlocks.BROWN_SHROOM_DOOR.get(), modLoc("block/brown_shroom_door_bottom"), modLoc( "block/brown_shroom_door_top"), ("cutout"))
		doorBlockWithRenderType( ModBlocks.SHROOM_STEM_DOOR.get(), modLoc("block/shroom_stem_door_bottom"), modLoc( "block/shroom_stem_door_top"), ("cutout"))

		trapdoorBlockWithRenderType(ModBlocks.RED_SHROOM_TRAPDOOR.get(), modLoc("block/red_shroom_trapdoor"), true, "cutout")
		trapdoorBlockWithRenderType(ModBlocks.BROWN_SHROOM_TRAPDOOR.get(), modLoc("block/brown_shroom_trapdoor"), true, "cutout")
		trapdoorBlockWithRenderType(ModBlocks.SHROOM_STEM_TRAPDOOR.get(), modLoc("block/shroom_stem_trapdoor"), true, "cutout")
}
/*
	fun blockItem(blockRegistryObject: RegistryObject<Block>) {
		simpleBlockItem(blockRegistryObject.get(), UncheckedModelFile("shroom_craft:block/" + blockRegistryObject.id.path))
	}

	fun blockItem(blockRegistryObject: RegistryObject<StairBlock>) {
		simpleBlockItem(blockRegistryObject.get(), UncheckedModelFile("shroom_craft:block/" + blockRegistryObject.id.path))
	}

	fun blockItem(blockRegistryObject: RegistryObject<SlabBlock>) {
		simpleBlockItem(blockRegistryObject.get(), UncheckedModelFile("shroom_craft:block/" + blockRegistryObject.id.path))
	}

	fun blockItem(blockRegistryObject: RegistryObject<PressurePlateBlock>) {
		simpleBlockItem(blockRegistryObject.get(), UncheckedModelFile("shroom_craft:block/" + blockRegistryObject.id.path))
	}

	fun blockItem(blockRegistryObject: RegistryObject<ButtonBlock>) {
		simpleBlockItem(blockRegistryObject.get(), UncheckedModelFile("shroom_craft:block/" + blockRegistryObject.id.path))
	}

	fun blockItem(blockRegistryObject: RegistryObject<FenceGateBlock>) {
		simpleBlockItem(blockRegistryObject.get(), UncheckedModelFile("shroom_craft:block/" + blockRegistryObject.id.path))
	}

 */
}