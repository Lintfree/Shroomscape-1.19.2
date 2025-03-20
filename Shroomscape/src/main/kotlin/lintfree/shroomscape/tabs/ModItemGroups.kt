package lintfree.shroomscape.tabs

import lintfree.shroomscape.Shroomscape
import lintfree.shroomscape.item.ModItems.ITEM_REGISTRY
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.Items
import net.minecraftforge.registries.RegistryObject


class ModItemGroups {
	object ShroomItemGroup : CreativeModeTab(Shroomscape.ID) {
		override fun makeIcon(): ItemStack {
			return ItemStack(Items.RED_MUSHROOM)
		}

		fun  addAllItemsToGroup() {
			ITEM_REGISTRY.entries.forEach { item: RegistryObject<Item> ->
				Item.Properties().tab(ShroomItemGroup)
			}
		}

	}

}