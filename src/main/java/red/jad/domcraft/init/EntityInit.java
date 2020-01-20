package red.jad.domcraft.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import red.jad.domcraft.dcm;
import red.jad.domcraft.entity.EntityChungus;
import red.jad.domcraft.utility.Reference;
import red.jad.domcraft.utility.handlers.RenderHandler;

public class EntityInit {
	public static void registerEntities() {
		registerEntity("chungus", EntityChungus.class, 610, 50, 6836575, 14799607);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int colorP, int colorS) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, dcm.instance, range, 1, true, colorP, colorS);
	}
}
