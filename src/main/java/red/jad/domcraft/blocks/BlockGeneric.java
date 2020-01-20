package red.jad.domcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import red.jad.domcraft.dcm;
import red.jad.domcraft.init.BlockInit;
import red.jad.domcraft.init.ItemInit;
import red.jad.domcraft.utility.IHasModel;

public class BlockGeneric extends Block implements IHasModel {
	public BlockGeneric(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() {
		dcm.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
