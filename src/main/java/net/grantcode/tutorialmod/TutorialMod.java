package net.grantcode.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.grantcode.tutorialmod.block.ModBlocks;
import net.grantcode.tutorialmod.item.ModItems;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
    public static final String MOD_ID = "tutorialmod";





	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

	}
}
