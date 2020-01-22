package red.jad.domcraft.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import red.jad.domcraft.init.ItemInit;
import red.jad.domcraft.utility.handlers.LootTableHandler;
import red.jad.domcraft.utility.handlers.SoundsHandler;

public class EntityChungus extends EntityPigZombie {

	public EntityChungus(World worldIn) {
		super(worldIn);
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
            player.playSound(SoundEvents.ENTITY_SLIME_SQUISH, 1.0F, 1.0F);
            itemstack.shrink(1);

            if (itemstack.isEmpty()){
                player.setHeldItem(hand, new ItemStack(ItemInit.BUCKET_OF_CUMGUS));
            }
            else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemInit.BUCKET_OF_CUMGUS))){
                player.dropItem(new ItemStack(ItemInit.BUCKET_OF_CUMGUS), false);
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
	
	@Override
	protected int getExperiencePoints(EntityPlayer player){
        return 0;
    }
	
	@Override
	@Nullable
    protected ResourceLocation getLootTable(){
        return LootTableHandler.ENTITIES_CHUNGUS;
    }
	
	@Override
	protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty){ }
}
