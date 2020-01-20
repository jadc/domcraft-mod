package red.jad.domcraft.entity.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumHandSide;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelChungus extends ModelBiped
{
    public static float modelSize = 4.0F;

    public ModelChungus()
    {
        super(modelSize, 0.0F, 64, 64);

        this.bipedLeftArm = new ModelRenderer(this, 32, 48);
        this.bipedLeftArm.addBox(4.0F, -2.0F, -2.0F, 3, 12, 4, modelSize / 4);
        this.bipedLeftArm.setRotationPoint(5.0F, 2.5F, 0.0F);
        this.bipedRightArm = new ModelRenderer(this, 40, 16);
        this.bipedRightArm.addBox(-7.0F, -2.0F, -2.0F, 3, 12, 4, modelSize / 4);
        this.bipedRightArm.setRotationPoint(-5.0F, 2.5F, 0.0F);
        this.bipedLeftLeg = new ModelRenderer(this, 16, 48);
        this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, modelSize);
        this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
    }

    public void postRenderArm(float scale, EnumHandSide side)
    {
        ModelRenderer modelrenderer = this.getArmForSide(side);

        float f = 0.5F * (float)(side == EnumHandSide.RIGHT ? 1 : -1);
        modelrenderer.rotationPointX += f;
        modelrenderer.postRender(scale);
        modelrenderer.rotationPointX -= f;
    }
}