package lintfree.shroomscape.datagen

import lintfree.shroomscape.Shroomscape.ID
import net.minecraftforge.data.event.GatherDataEvent
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod.EventBusSubscriber

@EventBusSubscriber(modid = ID, bus = EventBusSubscriber.Bus.MOD)
object DataGenerators {
	@SubscribeEvent
	fun gatherData(event: GatherDataEvent) {
		// val ops = RegistryOps.create(JsonOps.INSTANCE, RegistryAccess.builtinCopy()) biome and feature stuff
		val generator = event.generator
		val existingFileHelper = event.existingFileHelper
		if (event.includeClient()) {
			generator.addProvider(event.includeClient(), ShroomBlockStates(generator, existingFileHelper))
			generator.addProvider(event.includeClient(), ShroomItemModels(generator, existingFileHelper))
		}
		if (event.includeServer()) {
			generator.addProvider(event.includeServer(), ShroomBlockTags(generator, existingFileHelper))
		}
	}
}
