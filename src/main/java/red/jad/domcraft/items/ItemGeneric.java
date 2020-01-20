package red.jad.domcraft.items;

import net.minecraft.item.Item;
import red.jad.domcraft.dcm;
import red.jad.domcraft.init.ItemInit;
import red.jad.domcraft.utility.IHasModel;

public class ItemGeneric extends Item implements IHasModel {
	
	public ItemGeneric(String name) {
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
