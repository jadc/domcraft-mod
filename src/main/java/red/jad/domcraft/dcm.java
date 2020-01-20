package red.jad.domcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import red.jad.domcraft.proxy.CommonProxy;
import red.jad.domcraft.tabs.DomcraftTab;
import red.jad.domcraft.utility.Reference;
import red.jad.domcraft.utility.handlers.RegistryHandler;
import red.jad.domcraft.utility.handlers.SoundsHandler;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class dcm {
	
	public static final CreativeTabs domtab = new DomcraftTab();
	
	@Instance
	public static dcm instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent e){
		RegistryHandler.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent e){
		RegistryHandler.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent e){
		RegistryHandler.postInit();
    }
}
