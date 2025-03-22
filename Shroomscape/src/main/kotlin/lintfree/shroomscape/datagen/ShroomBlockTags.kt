package lintfree.shroomscape.datagen

import lintfree.shroomscape.Shroomscape.ID
import lintfree.shroomscape.block.ModBlocks
import net.minecraft.data.DataGenerator
import net.minecraft.data.tags.BlockTagsProvider
import net.minecraft.tags.BlockTags
import net.minecraftforge.common.data.ExistingFileHelper

class ShroomBlockTags(gen: DataGenerator, helper: ExistingFileHelper) : BlockTagsProvider(gen, ID, helper) {
    override fun addTags() {
//        need tags to have the fences and walls to connect to each other
//         Add fences to the fences tag
        tag(BlockTags.FENCES).add(
            ModBlocks.RED_SHROOM_FENCE.get(),
            ModBlocks.BROWN_SHROOM_FENCE.get(),
            ModBlocks.SHROOM_STEM_FENCE.get()
        )

//         Add walls to the walls tag
        tag(BlockTags.WALLS).add(
            ModBlocks.RED_SHROOM_WALL.get(),
            ModBlocks.BROWN_SHROOM_WALL.get(),
            ModBlocks.SHROOM_STEM_WALL.get()
        )
    }
} 