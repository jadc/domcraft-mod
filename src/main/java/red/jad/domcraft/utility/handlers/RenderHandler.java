package red.jad.domcraft.utility.handlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import red.jad.domcraft.entity.EntityChungus;
import red.jad.domcraft.entity.render.RenderChungus;

public class RenderHandler {
	public static void registerEntityRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityChungus.class, new IRenderFactory<EntityChungus>() {
			@Override
			public Render<? super EntityChungus> createRenderFor(RenderManager manager) {
				return new RenderChungus(manager);
			}
		});
	}
}
