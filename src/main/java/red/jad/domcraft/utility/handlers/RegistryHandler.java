package red.jad.domcraft.utility.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import red.jad.domcraft.init.BlockInit;
import red.jad.domcraft.init.EntityInit;
import red.jad.domcraft.init.ItemInit;
import red.jad.domcraft.utility.IHasModel;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> e) {
		e.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> e) {
		e.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent e) {
		for(Item item : ItemInit.ITEMS) if(item instanceof IHasModel) ((IHasModel) item).registerModels();
		for(Block block : BlockInit.BLOCKS) if(block instanceof IHasModel) ((IHasModel) block).registerModels();
	}
	
	public static void preInit() {
		SoundsHandler.registerSounds();
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenderers();
	}
	
	public static void init() {
	}
	
	public static void postInit() {
		
	}
}
