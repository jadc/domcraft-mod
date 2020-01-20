package red.jad.domcraft.entity.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import red.jad.domcraft.entity.EntityChungus;
import red.jad.domcraft.entity.model.ModelChungus;
import red.jad.domcraft.utility.Reference;

public class RenderChungus extends RenderLiving<EntityChungus> {
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/chungus.png");
	
	public RenderChungus(RenderManager manager) {
		super(manager, new ModelChungus(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityChungus e) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityChungus entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
