
package de.blutmondgilde.InfinityDogs;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
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
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
	}
}
