package red.jad.domcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import red.jad.domcraft.dcm;
import red.jad.domcraft.init.BlockInit;
import red.jad.domcraft.init.ItemInit;
import red.jad.domcraft.utility.IHasModel;

public class BlockMetallic extends BlockGeneric {
	public BlockMetallic(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setLightLevel(0.5F);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 0);
	}
}
