package lintfree.shroomscape.datagen

import com.mojang.serialization.JsonOps
import lintfree.shroomscape.Shroomscape.ID
import net.minecraft.core.RegistryAccess
import net.minecraft.resources.RegistryOps
import net.minecraftforge.data.event.GatherDataEvent
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod.EventBusSubscriber

@EventBusSubscriber(modid = ID, bus = EventBusSubscriber.Bus.MOD)
object DataGenerators {
	@SubscribeEvent
fun gatherData(event: GatherDataEvent) {
    val ops = RegistryOps.create(JsonOps.INSTANCE, RegistryAccess.builtinCopy())
    val generator = event.generator
    val existingFileHelper = event.existingFileHelper
			if (event.includeClient()) {
				generator.addProvider(event.includeClient(), ShroomBlockStates(generator, existingFileHelper))

	}
	}

}
