package red.jad.domcraft.utility.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import red.jad.domcraft.utility.Reference;

public class SoundsHandler {
	// Entities
	public static SoundEvent ENTITY_CHUNGUS_AMBIENT, ENTITY_CHUNGUS_HURT, ENTITY_CHUNGUS_DEATH;
	
	// Records
	public static SoundEvent RECORD_CHUNGUS;
	
	public static void registerSounds() {
		// Entities
		ENTITY_CHUNGUS_AMBIENT = registerSound("entity.chungus.ambient");
		ENTITY_CHUNGUS_HURT = registerSound("entity.chungus.hurt");
		ENTITY_CHUNGUS_DEATH = registerSound("entity.chungus.death");
		
		// Records
		RECORD_CHUNGUS = registerSound("record.chungus");
	}
	
	private static SoundEvent registerSound(String name) {
		ResourceLocation location = new ResourceLocation(Reference.MODID, name);
		SoundEvent sound = new SoundEvent(location);
		sound.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(sound);
		return sound;
	}
}
