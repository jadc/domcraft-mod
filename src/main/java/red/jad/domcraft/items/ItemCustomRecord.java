package red.jad.domcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import red.jad.domcraft.dcm;
import red.jad.domcraft.init.ItemInit;
import red.jad.domcraft.utility.IHasModel;

public class ItemCustomRecord extends ItemRecord implements IHasModel {
	
	public ItemCustomRecord(String name, SoundEvent song) {
		super(name, song);
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
