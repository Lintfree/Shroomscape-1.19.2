package lintfree.shroomscape.tabs

import lintfree.shroomscape.Shroomscape
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.Items


class ModItemGroups {
	object ShroomItemGroup : CreativeModeTab(Shroomscape.ID) {
		override fun makeIcon(): ItemStack {
			return ItemStack(Items.RED_MUSHROOM)
		}

		//fun  addAllItemsToGroup() {
			//ITEM_REGISTRY.entries.forEach { item: RegistryObject<Item> ->
				//Item.Properties().tab(ShroomItemGroup)
			//}
		//}

	}

}