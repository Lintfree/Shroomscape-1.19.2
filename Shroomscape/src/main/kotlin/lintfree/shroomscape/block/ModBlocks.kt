package lintfree.shroomscape.block

import lintfree.shroomscape.Shroomscape
import lintfree.shroomscape.item.ModItems
import lintfree.shroomscape.tabs.ModItemGroups
import net.minecraft.sounds.SoundEvent
import net.minecraft.sounds.SoundEvents
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.*
import net.minecraft.world.level.block.Blocks.*
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.Material
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegistryObject
import java.util.function.Supplier

object ModBlocks {
    val BLOCK_REGISTRY: DeferredRegister<Block?> = DeferredRegister.create(ForgeRegistries.BLOCKS, Shroomscape.ID)

    // the returned ObjectHolderDelegate can be used as a property delegate
    // this is automatically registered by the deferred registry at the correct times
    val RED_SHROOM_STAIRS : RegistryObject<StairBlock> = registerBlock("red_shroom_stairs") { ->
        StairBlock({RED_MUSHROOM_BLOCK.defaultBlockState()}, BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS))
    }
    val BROWN_SHROOM_STAIRS : RegistryObject<StairBlock> = registerBlock("brown_shroom_stairs") { ->
        StairBlock({BROWN_MUSHROOM_BLOCK.defaultBlockState()}, BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS))
    }

    val SHROOM_STEM_STAIRS : RegistryObject<StairBlock> = registerBlock("shroom_stem_stairs") { ->
        StairBlock({RED_MUSHROOM_BLOCK.defaultBlockState()}, BlockBehaviour.Properties.copy(MUSHROOM_STEM)
            .sound(SoundType.FUNGUS))
    }

    val RED_SHROOM_SLAB: RegistryObject<SlabBlock> = registerBlock("red_shroom_slab") {
        SlabBlock(BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS))
    }

    val BROWN_SHROOM_SLAB: RegistryObject<SlabBlock> = registerBlock("brown_shroom_slab") {
        SlabBlock(BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS))
    }

    val SHROOM_STEM_SLAB: RegistryObject<SlabBlock> = registerBlock("shroom_stem_slab") {
        SlabBlock(BlockBehaviour.Properties.copy(MUSHROOM_STEM)
            .sound(SoundType.FUNGUS))
    }

    val RED_SHROOM_PRESSURE_PLATE: RegistryObject<PressurePlateBlock> = registerBlock("red_shroom_pressure_plate") {
        PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK)
                .sound(SoundType.FUNGUS))
    }

    val BROWN_SHROOM_PRESSURE_PLATE: RegistryObject<PressurePlateBlock> = registerBlock("brown_shroom_pressure_plate") {
        PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK)
                .sound(SoundType.FUNGUS))
    }

    val SHROOM_STEM_PRESSURE_PLATE: RegistryObject<PressurePlateBlock> = registerBlock("shroom_stem_pressure_plate") {
        PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.copy(MUSHROOM_STEM)
                .sound(SoundType.FUNGUS))
    }

    class CustomButtonBlock(properties: Properties) : ButtonBlock(false, properties) {
        override fun getSound(p_51102_: Boolean): SoundEvent {
            return SoundEvents.FUNGUS_HIT
        }
    }

    val RED_SHROOM_BUTTON: RegistryObject<ButtonBlock> = registerBlock("red_shroom_button") {
        CustomButtonBlock(
            BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK))
    }

    val BROWN_SHROOM_BUTTON: RegistryObject<ButtonBlock> = registerBlock("brown_shroom_button") {
        CustomButtonBlock(
            BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK))
    }

    val SHROOM_STEM_BUTTON: RegistryObject<ButtonBlock> = registerBlock("shroom_stem_button") {
        CustomButtonBlock(
            BlockBehaviour.Properties.copy(MUSHROOM_STEM))
    }

    val RED_SHROOM_FENCE: RegistryObject<FenceBlock> = registerBlock("red_shroom_fence") {
        FenceBlock(BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS))
    }

    val BROWN_SHROOM_FENCE: RegistryObject<FenceBlock> = registerBlock("brown_shroom_fence") {
        FenceBlock(BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS))
    }

    val SHROOM_STEM_FENCE: RegistryObject<FenceBlock> = registerBlock("shroom_stem_fence") {
        FenceBlock(BlockBehaviour.Properties.copy(MUSHROOM_STEM)
            .sound(SoundType.FUNGUS))
    }

    val RED_SHROOM_FENCE_GATE: RegistryObject<FenceGateBlock> = registerBlock("red_shroom_fence_gate") {
        FenceGateBlock(BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS))
    }

    val BROWN_SHROOM_FENCE_GATE: RegistryObject<FenceGateBlock> = registerBlock("brown_shroom_fence_gate") {
        FenceGateBlock(BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS))
    }

    val SHROOM_STEM_FENCE_GATE: RegistryObject<FenceGateBlock> = registerBlock("shroom_stem_fence_gate") {
        FenceGateBlock(BlockBehaviour.Properties.copy(MUSHROOM_STEM)
            .sound(SoundType.FUNGUS))
    }

    val RED_SHROOM_WALL: RegistryObject<WallBlock> = registerBlock("red_shroom_wall") {
        WallBlock(BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK).sound(SoundType.FUNGUS))
    }

    val BROWN_SHROOM_WALL: RegistryObject<WallBlock> = registerBlock("brown_shroom_wall") {
        WallBlock(BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK).sound(SoundType.FUNGUS))
    }

    val SHROOM_STEM_WALL: RegistryObject<WallBlock> = registerBlock("shroom_stem_wall") {
        WallBlock(BlockBehaviour.Properties.copy(MUSHROOM_STEM).sound(SoundType.FUNGUS))
    }

    val  RED_SHROOM_DOOR: RegistryObject<DoorBlock> = registerBlock("red_shroom_door") {
        DoorBlock(BlockBehaviour.Properties.of ( Material.WOOD)
            .strength(3.0f)
            .sound(SoundType.FUNGUS)
            .noOcclusion())
    }

    val  BROWN_SHROOM_DOOR: RegistryObject<DoorBlock> = registerBlock("brown_shroom_door") {
        DoorBlock(BlockBehaviour.Properties.of( Material.WOOD)
            .strength(3.0f)
            .sound(SoundType.FUNGUS)
            .noOcclusion())
    }

    val  SHROOM_STEM_DOOR: RegistryObject<DoorBlock> = registerBlock("shroom_stem_door") {
        DoorBlock(BlockBehaviour.Properties.of( Material.WOOD)
            .strength(3.0f)
            .sound(SoundType.FUNGUS)
            .noOcclusion())
    }

    val RED_SHROOM_TRAPDOOR: RegistryObject<TrapDoorBlock> = registerBlock("red_shroom_trapdoor") {
        TrapDoorBlock(BlockBehaviour.Properties.of( Material.WOOD)
            .sound(SoundType.FUNGUS)
            .noOcclusion()
            .strength(3.0f))
    }

    val BROWN_SHROOM_TRAPDOOR: RegistryObject<TrapDoorBlock> = registerBlock("brown_shroom_trapdoor") {
        TrapDoorBlock(BlockBehaviour.Properties.of( Material.WOOD)
            .sound(SoundType.FUNGUS)
            .noOcclusion()
            .strength(3.0f))

    }

    val SHROOM_STEM_TRAPDOOR: RegistryObject<TrapDoorBlock> = registerBlock("shroom_stem_trapdoor") {
        TrapDoorBlock(BlockBehaviour.Properties.of( Material.WOOD)
            .sound(SoundType.FUNGUS)
            .noOcclusion()
            .strength(3.0f))
    }


    private fun <T : Block?> registerBlock(blockName: String, blockSupplier: Supplier<T>): RegistryObject<T> {
        val registeredBlock: RegistryObject<T> = BLOCK_REGISTRY.register(blockName, blockSupplier)
        registerBlockItem(blockName, registeredBlock)
        return registeredBlock
    }

    private fun <T: Block?>registerBlockItem(blockName: String, block: RegistryObject<T>) {
        ModItems.ITEM_REGISTRY.register(blockName) { -> BlockItem(block.get(), Item.Properties().tab(ModItemGroups.ShroomItemGroup)) }
    }
}