package lintfree.shroomscape.datagen

import lintfree.shroomscape.Shroomscape.ID
import lintfree.shroomscape.block.ModBlocks
import net.minecraft.data.DataGenerator
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.ButtonBlock
import net.minecraft.world.level.block.DoorBlock
import net.minecraft.world.level.block.FenceBlock
import net.minecraft.world.level.block.FenceGateBlock
import net.minecraft.world.level.block.PressurePlateBlock
import net.minecraft.world.level.block.SlabBlock
import net.minecraft.world.level.block.StairBlock
import net.minecraft.world.level.block.TrapDoorBlock
import net.minecraft.world.level.block.WallBlock
import net.minecraftforge.client.model.generators.ItemModelBuilder
import net.minecraftforge.client.model.generators.ItemModelProvider
import net.minecraftforge.common.data.ExistingFileHelper
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegistryObject

@Suppress("removal")
class ShroomItemModels(gen: DataGenerator, helper: ExistingFileHelper) :
	ItemModelProvider(gen, ID, helper) {

@Suppress("DEPRECATION")
override fun registerModels() {
	simpleStairItem(ModBlocks.RED_SHROOM_STAIRS)
	simpleStairItem(ModBlocks.BROWN_SHROOM_STAIRS)
	simpleStairItem(ModBlocks.SHROOM_STEM_STAIRS)

	simpleSlabItem( ModBlocks.RED_SHROOM_SLAB)
	simpleSlabItem( ModBlocks.BROWN_SHROOM_SLAB)
	simpleSlabItem( ModBlocks.SHROOM_STEM_SLAB)

	simplePressurePlateItem(ModBlocks.RED_SHROOM_PRESSURE_PLATE)
	simplePressurePlateItem(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE)
	simplePressurePlateItem(ModBlocks.SHROOM_STEM_PRESSURE_PLATE)

	buttonItem(ModBlocks.RED_SHROOM_BUTTON, ResourceLocation("minecraft", "block/red_mushroom_block"))
	buttonItem(ModBlocks.BROWN_SHROOM_BUTTON, ResourceLocation("minecraft", "block/brown_mushroom_block"))
	buttonItem(ModBlocks.SHROOM_STEM_BUTTON, ResourceLocation("minecraft", "block/mushroom_stem"))

	fenceItem(ModBlocks.RED_SHROOM_FENCE, ResourceLocation("minecraft", "block/red_mushroom_block"))
	fenceItem(ModBlocks.BROWN_SHROOM_FENCE, ResourceLocation("minecraft", "block/brown_mushroom_block"))
	fenceItem(ModBlocks.SHROOM_STEM_FENCE, ResourceLocation("minecraft", "block/mushroom_stem"))

	simpleFenceGateItem( ModBlocks.RED_SHROOM_FENCE_GATE)
	simpleFenceGateItem( ModBlocks.BROWN_SHROOM_FENCE_GATE)
	simpleFenceGateItem( ModBlocks.SHROOM_STEM_FENCE_GATE)

	doorBlockItem(ModBlocks.RED_SHROOM_DOOR)
	doorBlockItem(ModBlocks.BROWN_SHROOM_DOOR)
	doorBlockItem(ModBlocks.SHROOM_STEM_DOOR)

	wallItem(ModBlocks.RED_SHROOM_WALL, ResourceLocation("minecraft", "block/red_mushroom_block"))
	wallItem(ModBlocks.BROWN_SHROOM_WALL, ResourceLocation("minecraft", "block/brown_mushroom_block"))
	wallItem(ModBlocks.SHROOM_STEM_WALL, ResourceLocation("minecraft", "block/mushroom_stem"))

	trapdoorItem(ModBlocks.RED_SHROOM_TRAPDOOR)
	trapdoorItem(ModBlocks.BROWN_SHROOM_TRAPDOOR)
	trapdoorItem(ModBlocks.SHROOM_STEM_TRAPDOOR)

}
	override fun getName(): String {
		return "Item Models"
	}

	private fun buttonItem(block: RegistryObject<ButtonBlock>, baseBlock: ResourceLocation) {
		withExistingParent(block.id.path, mcLoc("block/button_inventory"))
			.texture("texture", baseBlock)

	}

	private fun fenceItem(block: RegistryObject<FenceBlock>, baseBlock: ResourceLocation) {
		withExistingParent(block.id.path, mcLoc("block/fence_inventory"))
			.texture("texture", baseBlock)
	}

	private fun wallItem(block: RegistryObject<WallBlock>, baseBlock: ResourceLocation) {
		withExistingParent(block.id.path, mcLoc("block/wall_inventory"))
			.texture("wall", baseBlock)
	}

	private fun doorBlockItem(item: RegistryObject<DoorBlock>): ItemModelBuilder {
		return withExistingParent(item.id.path, mcLoc("item/generated"))
			.texture("layer0", modLoc("item/" + item.id.path))
	}

	fun simpleStairItem(block: RegistryObject<StairBlock>) {
		this.withExistingParent(
			ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()) !!.path,
			modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()) !!.path)
		)
	}

	fun simpleSlabItem(block: RegistryObject<SlabBlock>) {
		this.withExistingParent(
			ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()) !!.path,
			modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()) !!.path)
		)
	}

	fun simplePressurePlateItem(block: RegistryObject<PressurePlateBlock>) {
		this.withExistingParent(
			ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()) !!.path,
			modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()) !!.path)
		)
	}

	fun simpleFenceGateItem(block: RegistryObject<FenceGateBlock>) {
		this.withExistingParent(
			ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()) !!.path,
			modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()) !!.path)
		)
	}

	fun trapdoorItem(block: RegistryObject<TrapDoorBlock>) {
		this.withExistingParent(
			ForgeRegistries.BLOCKS.getKey(block.get()) !!.path,
			modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()) !!.path + "_bottom")
		)
	}

}
