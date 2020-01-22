package red.jad.domcraft.items;


import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import red.jad.domcraft.dcm;
import red.jad.domcraft.init.ItemInit;
import red.jad.domcraft.utility.IHasModel;

public class ItemBucketOfCumgus extends ItemSoup implements IHasModel {
	
	String name = "bucket_of_cumgus";
	
	public ItemBucketOfCumgus() {
		super(2);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(dcm.domtab);
		
		ItemInit.ITEMS.add(this);
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving){
        super.onItemUseFinish(stack, worldIn, entityLiving);
        if (!worldIn.isRemote){
        	entityLiving.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 20*20, 3));
        	entityLiving.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20*20, 2));
        	entityLiving.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 3*20, 0));
        	entityLiving.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 20*20, 0));
        }
        return new ItemStack(Items.BUCKET);
    }
	
	@Override
	public void registerModels() {
		dcm.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
