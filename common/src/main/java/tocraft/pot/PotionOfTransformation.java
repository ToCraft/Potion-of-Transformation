package tocraft.pot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import tocraft.craftedcore.events.common.PlayerEvents;
import tocraft.craftedcore.platform.Platform;
import tocraft.craftedcore.platform.VersionChecker;

public class PotionOfTransformation {

	public static final Logger LOGGER = LoggerFactory.getLogger(PotionOfTransformation.class);
	public static final String MODID = "pot";
	public static String versionURL = "https://raw.githubusercontent.com/ToCraft/Remorphed/1.20.2/gradle.properties";
	
	public void initialize() {
		PlayerEvents.PLAYER_JOIN.register(player -> {
			String newestVersion = VersionChecker.checkForNewVersion(versionURL);
			if (newestVersion != null && !Platform.getMod(MODID).getVersion().equals(newestVersion))
				player.sendSystemMessage(Component.translatable("pot.update", newestVersion));
		});
	}

	public static ResourceLocation id(String name) {
		return new ResourceLocation(MODID, name);
	}
}
