package red.jad.domcraft.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import red.jad.domcraft.utility.handlers.SoundsHandler;

public class EntityChungus extends EntityCow {

	public EntityChungus(World worldIn) {
		super(worldIn);
	}
	
	@Override
	public EntityCow createChild(EntityAgeable a) {
		return new EntityChungus(world);
	}
	
	@Override
	protected SoundEvent getAmbientSound(){
        return SoundsHandler.ENTITY_CHUNGUS_AMBIENT;
    }
	
	@Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn){
        return SoundsHandler.ENTITY_CHUNGUS_HURT;
    }
	
	@Override
    protected SoundEvent getDeathSound(){
        return SoundsHandler.ENTITY_CHUNGUS_DEATH;
    }
	
	@Override
	public boolean processInteract(EntityPlayer player, EnumHand hand){
        ItemStack itemstack = player.getHeldItem(hand);

        if (itemstack.getItem() == Items.BUCKET && !player.capabilities.isCreativeMode){
            player.playSound(SoundEvents.ENTITY_COW_MILK, 1.0F, 1.0F);
            itemstack.shrink(1);

            if (itemstack.isEmpty()){
                player.setHeldItem(hand, new ItemStack(Items.MILK_BUCKET));
            }
            else if (!player.inventory.addItemStackToInventory(new ItemStack(Items.MILK_BUCKET))){
                player.dropItem(new ItemStack(Items.MILK_BUCKET), false);
            }

            return true;
        }
        else
        {
            return super.processInteract(player, hand);
        }
    }
	
	@Override
	protected void applyEntityAttributes(){
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
    }
}
