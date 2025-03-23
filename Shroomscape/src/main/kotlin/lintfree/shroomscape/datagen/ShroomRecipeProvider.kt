package lintfree.shroomscape.datagen

import lintfree.shroomscape.block.ModBlocks
import net.minecraft.data.DataGenerator
import net.minecraft.data.recipes.FinishedRecipe
import net.minecraft.data.recipes.RecipeProvider
import net.minecraft.world.item.Items.*
import net.minecraft.world.item.crafting.Ingredient
import net.minecraftforge.common.crafting.conditions.IConditionBuilder
import java.util.function.Consumer

class ShroomRecipes(p_125973_: DataGenerator) : RecipeProvider(p_125973_), IConditionBuilder {

	override fun buildCraftingRecipes(p_176532_: Consumer<FinishedRecipe?>) {
		super.buildCraftingRecipes(p_176532_)

		val pWriter = Consumer<FinishedRecipe> { p_176532_.accept(it) }

		stairBuilder(ModBlocks.RED_SHROOM_STAIRS.get(), Ingredient.of(RED_MUSHROOM_BLOCK)).group("shroomcraft")
			.unlockedBy("has_red_mushroom_block", has(RED_MUSHROOM_BLOCK)).save(pWriter)
		stairBuilder(ModBlocks.BROWN_SHROOM_STAIRS.get(), Ingredient.of(BROWN_MUSHROOM_BLOCK)).group("shroomcraft")
			.unlockedBy("has_brown_mushroom_block", has(BROWN_MUSHROOM_BLOCK)).save(pWriter)
		stairBuilder(ModBlocks.SHROOM_STEM_STAIRS.get(), Ingredient.of(MUSHROOM_STEM)).group("shroomcraft")
			.unlockedBy("has_mushroom_stem", has(RED_MUSHROOM_BLOCK)).save(pWriter)

		slab(pWriter, ModBlocks.RED_SHROOM_SLAB.get(), RED_MUSHROOM_BLOCK)
		slab(pWriter, ModBlocks.BROWN_SHROOM_SLAB.get(), BROWN_MUSHROOM_BLOCK)
		slab(pWriter, ModBlocks.SHROOM_STEM_SLAB.get(), MUSHROOM_STEM)

		pressurePlate( pWriter, ModBlocks.RED_SHROOM_PRESSURE_PLATE.get(), RED_MUSHROOM_BLOCK)
		pressurePlate(pWriter, ModBlocks.BROWN_SHROOM_PRESSURE_PLATE.get(), BROWN_MUSHROOM_BLOCK)
		pressurePlate(pWriter, ModBlocks.SHROOM_STEM_PRESSURE_PLATE.get(), MUSHROOM_STEM)

		buttonBuilder(ModBlocks.RED_SHROOM_BUTTON.get().asItem(), Ingredient.of(RED_MUSHROOM_BLOCK)).group("shroomcraft")
			.unlockedBy("has_red_mushroom_block", has(RED_MUSHROOM_BLOCK)).save(pWriter)
		buttonBuilder(ModBlocks.BROWN_SHROOM_BUTTON.get().asItem(), Ingredient.of(BROWN_MUSHROOM_BLOCK)).group("shroomcraft")
			.unlockedBy("has_brown_mushroom_block", has(BROWN_MUSHROOM_BLOCK)).save(pWriter)
		buttonBuilder(ModBlocks.SHROOM_STEM_BUTTON.get().asItem(), Ingredient.of(MUSHROOM_STEM)).group("shroomcraft")
			.unlockedBy("has_mushroom_stem", has(MUSHROOM_STEM)).save(pWriter)

		fenceBuilder( ModBlocks.RED_SHROOM_FENCE.get(), Ingredient.of(RED_MUSHROOM_BLOCK)).group("shroomcraft")
			.unlockedBy("has_red_mushroom_block", has(RED_MUSHROOM_BLOCK)).save(pWriter)
		fenceBuilder( ModBlocks.BROWN_SHROOM_FENCE.get(), Ingredient.of(BROWN_MUSHROOM_BLOCK)).group("shroomcraft")
			.unlockedBy("has_brown_mushroom_block", has(BROWN_MUSHROOM_BLOCK)).save(pWriter)
		fenceBuilder( ModBlocks.SHROOM_STEM_FENCE.get(), Ingredient.of(MUSHROOM_STEM)).group("shroomcraft")
			.unlockedBy("has_mushroom_stem", has(MUSHROOM_STEM)).save(pWriter)

		fenceGateBuilder( ModBlocks.RED_SHROOM_FENCE_GATE.get(), Ingredient.of(RED_MUSHROOM_BLOCK)).group("shroomcraft")
			.unlockedBy("has_red_mushroom_block", has(RED_MUSHROOM_BLOCK)).save(pWriter)
		fenceGateBuilder( ModBlocks.BROWN_SHROOM_FENCE_GATE.get(), Ingredient.of(BROWN_MUSHROOM_BLOCK)).group("shroomcraft")
			.unlockedBy("has_brown_mushroom_block", has(BROWN_MUSHROOM_BLOCK)).save(pWriter)
		fenceGateBuilder( ModBlocks.SHROOM_STEM_FENCE_GATE.get(), Ingredient.of(MUSHROOM_STEM)).group("shroomcraft")
			.unlockedBy("has_mushroom_stem", has(MUSHROOM_STEM)).save(pWriter)

		doorBuilder(ModBlocks.RED_SHROOM_DOOR.get(), Ingredient.of(RED_MUSHROOM_BLOCK)).group("shroomcraft")
			.unlockedBy("has_red_mushroom_block", has(RED_MUSHROOM_BLOCK)).save(pWriter)
		doorBuilder(ModBlocks.BROWN_SHROOM_DOOR.get(), Ingredient.of(BROWN_MUSHROOM_BLOCK)).group("shroomcraft")
			.unlockedBy("has_brown_mushroom_block", has(BROWN_MUSHROOM_BLOCK)).save(pWriter)
		doorBuilder(ModBlocks.SHROOM_STEM_DOOR.get(), Ingredient.of(MUSHROOM_STEM)).group("shroomcraft")
			.unlockedBy("has_mushroom_stem", has(MUSHROOM_STEM)).save(pWriter)

		wall(pWriter, ModBlocks.RED_SHROOM_WALL.get(), RED_MUSHROOM_BLOCK)
		wall(pWriter, ModBlocks.BROWN_SHROOM_WALL.get(), BROWN_MUSHROOM_BLOCK)
		wall(pWriter, ModBlocks.SHROOM_STEM_WALL.get(), MUSHROOM_STEM)

		trapdoorBuilder(ModBlocks.RED_SHROOM_TRAPDOOR.get(), Ingredient.of(RED_MUSHROOM_BLOCK)).group("shroomcraft")
			.unlockedBy("has_red_mushroom_block", has(RED_MUSHROOM_BLOCK)).save(pWriter)
		trapdoorBuilder(ModBlocks.BROWN_SHROOM_TRAPDOOR.get(), Ingredient.of(BROWN_MUSHROOM_BLOCK)).group("shroomcraft")
			.unlockedBy("has_brown_mushroom_block", has(BROWN_MUSHROOM_BLOCK)).save(pWriter)
		trapdoorBuilder(ModBlocks.SHROOM_STEM_TRAPDOOR.get(), Ingredient.of(MUSHROOM_STEM)).group("shroomcraft")
			.unlockedBy("has_mushroom_stem", has(MUSHROOM_STEM)).save(pWriter)

	}
}
