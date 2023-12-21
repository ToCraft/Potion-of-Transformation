package tocraft.pot.events;

import net.minecraft.server.level.ServerPlayer;
import tocraft.craftedcore.events.Event.Result;
import tocraft.walkers.api.event.ShapeEvents;
import tocraft.walkers.api.variant.ShapeType;

public class UnlockShapesCallback implements ShapeEvents.UnlockShapeCallback {

	@Override
	public Result unlock(ServerPlayer player, ShapeType<?> type) {
		return Result.interruptFalse();
	}

}
