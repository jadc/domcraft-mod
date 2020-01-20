package red.jad.domcraft.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import red.jad.domcraft.init.ItemInit;

public class DomcraftTab extends CreativeTabs {

	public DomcraftTab() {
		super("domcrafttab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.DOMCOIN);
	}

}
