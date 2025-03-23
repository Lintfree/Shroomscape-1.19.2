package lintfree.shroomscape.datagen

import lintfree.shroomscape.Shroomscape.ID
import lintfree.shroomscape.block.ModBlocks
import net.minecraft.data.DataGenerator
import net.minecraft.data.tags.BlockTagsProvider
import net.minecraft.tags.BlockTags.*
import net.minecraftforge.common.data.ExistingFileHelper

class ShroomBlockTags(gen: DataGenerator, helper: ExistingFileHelper) : BlockTagsProvider(gen, ID, helper) {
    override fun addTags() {
//        need tags to have the fences and walls to connect to each other
        tag(FENCES).add(ModBlocks.RED_SHROOM_FENCE.get(), ModBlocks.BROWN_SHROOM_FENCE.get(), ModBlocks.SHROOM_STEM_FENCE.get())

        tag(FENCE_GATES).add(ModBlocks.RED_SHROOM_FENCE_GATE.get(), ModBlocks.BROWN_SHROOM_FENCE_GATE.get(), ModBlocks.SHROOM_STEM_FENCE_GATE.get())

        tag(WALLS).add(ModBlocks.RED_SHROOM_WALL.get(), ModBlocks.BROWN_SHROOM_WALL.get(), ModBlocks.SHROOM_STEM_WALL.get())

        tag(BUTTONS).add(ModBlocks.RED_SHROOM_BUTTON.get(), ModBlocks.BROWN_SHROOM_BUTTON.get(), ModBlocks.SHROOM_STEM_BUTTON.get())

        tag(STAIRS).add(ModBlocks.RED_SHROOM_STAIRS.get(), ModBlocks.BROWN_SHROOM_STAIRS.get(), ModBlocks.SHROOM_STEM_STAIRS.get())

        tag(SLABS).add(ModBlocks.RED_SHROOM_SLAB.get(), ModBlocks.BROWN_SHROOM_SLAB.get(), ModBlocks.SHROOM_STEM_SLAB.get())

        tag(DOORS).add(ModBlocks.RED_SHROOM_DOOR.get(), ModBlocks.BROWN_SHROOM_DOOR.get(), ModBlocks.SHROOM_STEM_DOOR.get())

        tag(TRAPDOORS).add(ModBlocks.RED_SHROOM_TRAPDOOR.get(), ModBlocks.BROWN_SHROOM_TRAPDOOR.get(), ModBlocks.SHROOM_STEM_TRAPDOOR.get())

        tag(PRESSURE_PLATES).add(ModBlocks.RED_SHROOM_PRESSURE_PLATE.get(), ModBlocks.BROWN_SHROOM_PRESSURE_PLATE.get(), ModBlocks.SHROOM_STEM_PRESSURE_PLATE.get())

        tag(MINEABLE_WITH_AXE)
            .add(ModBlocks.RED_SHROOM_FENCE.get())
            .add(ModBlocks.BROWN_SHROOM_FENCE.get())
            .add(ModBlocks.SHROOM_STEM_FENCE.get())
            .add(ModBlocks.RED_SHROOM_FENCE_GATE.get())
            .add(ModBlocks.BROWN_SHROOM_FENCE_GATE.get())
            .add(ModBlocks.SHROOM_STEM_FENCE_GATE.get())
            .add(ModBlocks.RED_SHROOM_BUTTON.get())
            .add(ModBlocks.BROWN_SHROOM_BUTTON.get())
            .add(ModBlocks.SHROOM_STEM_BUTTON.get())
            .add(ModBlocks.RED_SHROOM_DOOR.get())
            .add(ModBlocks.BROWN_SHROOM_DOOR.get())
            .add(ModBlocks.SHROOM_STEM_DOOR.get())
            .add(ModBlocks.RED_SHROOM_TRAPDOOR.get())
            .add(ModBlocks.BROWN_SHROOM_TRAPDOOR.get())
            .add(ModBlocks.SHROOM_STEM_TRAPDOOR.get())
            .add(ModBlocks.RED_SHROOM_PRESSURE_PLATE.get())
            .add(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE.get())
            .add(ModBlocks.SHROOM_STEM_PRESSURE_PLATE.get())

        tag(MINEABLE_WITH_PICKAXE)
            .add(ModBlocks.RED_SHROOM_WALL.get())
            .add(ModBlocks.BROWN_SHROOM_WALL.get())
            .add(ModBlocks.SHROOM_STEM_WALL.get())
            .add(ModBlocks.RED_SHROOM_STAIRS.get())
            .add(ModBlocks.BROWN_SHROOM_STAIRS.get())
            .add(ModBlocks.SHROOM_STEM_STAIRS.get())
            .add(ModBlocks.RED_SHROOM_SLAB.get())
            .add(ModBlocks.BROWN_SHROOM_SLAB.get())
            .add(ModBlocks.SHROOM_STEM_SLAB.get())
    }
} 