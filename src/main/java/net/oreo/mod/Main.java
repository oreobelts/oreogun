package net.oreo.mod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.oreo.mod.blocks.ModBlocks;
import net.oreo.mod.customcreativemodetabs.CustomCreativeModeTabs;
import net.oreo.mod.modItems.ModItems;
import net.oreo.mod.registries.ModFuels;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "oreogun";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		CustomCreativeModeTabs.registerModCreativeModeTabs();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModFuels.registerFuels();
	}

	public static Identifier id(String path)	 {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
