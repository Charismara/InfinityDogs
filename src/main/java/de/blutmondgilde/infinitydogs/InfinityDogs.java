
package de.blutmondgilde.infinitydogs;

import de.blutmondgilde.infinitydogs.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = InfinityDogs.MODID, version = InfinityDogs.VERSION, name = InfinityDogs.NAME)
public class InfinityDogs {
	public static final String MODID = "infinitydogs";
	public static final String NAME = "InfinityDogs";
	public static final String VERSION = "1.0";

	@Instance(MODID)
	public static InfinityDogs instance = new InfinityDogs();

	@SidedProxy(modId = MODID, serverSide = "de.blutmondgilde.infinitydogs.proxy.CommonProxy", clientSide = "de.blutmondgilde.infinitydogs.proxy.ClientProxy")
	public static CommonProxy proxy = new CommonProxy();
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
	}

	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		proxy.registerModels();
	}
}
