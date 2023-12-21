package tocraft.pot.forge;

import net.minecraftforge.fml.common.Mod;
import tocraft.pot.PotionOfTransformation;

@Mod(PotionOfTransformation.MODID)
public class PotionOfTransformationForge {

	public PotionOfTransformationForge() {
		new PotionOfTransformation().initialize();
	}
}
