package red.jad.domcraft.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import red.jad.domcraft.blocks.BlockGeneric;
import red.jad.domcraft.blocks.BlockMetallic;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Registration
	public static final BlockGeneric DOMCOIN_BLOCK = new BlockMetallic("domcoin_block", Material.IRON);
}
