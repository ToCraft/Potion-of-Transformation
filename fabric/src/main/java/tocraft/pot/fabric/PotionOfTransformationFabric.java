package tocraft.pot.fabric;

import net.fabricmc.api.ModInitializer;
import tocraft.pot.PotionOfTransformation;

public class PotionOfTransformationFabric implements ModInitializer {

	@Override
	public void onInitialize() {
		new PotionOfTransformation().initialize();
	}
}
