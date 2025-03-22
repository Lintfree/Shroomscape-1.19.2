package lintfree.shroomscape.datagen

import lintfree.shroomscape.Shroomscape.ID
import net.minecraft.data.DataGenerator
import net.minecraftforge.client.model.generators.ItemModelProvider
import net.minecraftforge.common.data.ExistingFileHelper

class ShroomItemModels(gen: DataGenerator, helper: ExistingFileHelper) :
	ItemModelProvider(gen, ID, helper) {

@Suppress("DEPRECATION")
override fun registerModels() {
	withExistingParent( "red_shroom_stairs", modLoc("block/red_shroom_stairs"))
	withExistingParent( "brown_shroom_stairs", modLoc("block/brown_shroom_stairs"))
	withExistingParent( "shroom_stem_stairs", modLoc("block/shroom_stem_stairs"))

	withExistingParent( "red_shroom_slab", modLoc("block/red_shroom_slab"))
	withExistingParent( "brown_shroom_slab", modLoc("block/brown_shroom_slab"))
	withExistingParent( "shroom_stem_slab", modLoc("block/shroom_stem_slab"))

	withExistingParent( "red_shroom_pressure_plate", modLoc("block/red_shroom_pressure_plate"))
	withExistingParent( "brown_shroom_pressure_plate", modLoc("block/brown_shroom_pressure_plate"))
	withExistingParent( "shroom_stem_pressure_plate", modLoc("block/shroom_stem_pressure_plate"))

	withExistingParent( "red_shroom_button", modLoc("block/red_shroom_button"))
	withExistingParent( "brown_shroom_button", modLoc("block/brown_shroom_button"))
	withExistingParent( "shroom_stem_button", modLoc("block/shroom_stem_button"))

	withExistingParent( "red_shroom_fence", modLoc("block/red_shroom_fence_side"))
	withExistingParent( "brown_shroom_fence", modLoc("block/brown_shroom_fence_side"))
	withExistingParent( "shroom_stem_fence", modLoc("block/shroom_stem_fence_side"))

	withExistingParent( "red_shroom_fence_gate", modLoc("block/red_shroom_fence_gate"))
	withExistingParent( "brown_shroom_fence_gate", modLoc("block/brown_shroom_fence_gate"))
	withExistingParent( "shroom_stem_fence_gate", modLoc("block/shroom_stem_fence_gate"))

	withExistingParent( "red_shroom_door", modLoc("block/red_shroom_door_bottom_left"))
	withExistingParent( "brown_shroom_door", modLoc("block/brown_shroom_door_bottom_left"))
	withExistingParent( "shroom_stem_door", modLoc("block/shroom_stem_door_bottom_left"))

	withExistingParent( "red_shroom_wall", modLoc("block/red_shroom_wall_side"))
	withExistingParent( "brown_shroom_wall", modLoc("block/brown_shroom_wall_side"))
	withExistingParent( "shroom_stem_wall", modLoc("block/shroom_stem_wall_side"))

}
	override fun getName(): String {
		return "Item Models"
	}

}
