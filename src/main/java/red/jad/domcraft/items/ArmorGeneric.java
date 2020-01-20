package red.jad.domcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import red.jad.domcraft.dcm;
import red.jad.domcraft.init.ItemInit;
import red.jad.domcraft.utility.IHasModel;

public class ArmorGeneric extends ItemArmor implements IHasModel {

	public ArmorGeneric(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(dcm.domtab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		dcm.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
