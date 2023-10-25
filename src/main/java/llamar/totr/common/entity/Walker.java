package llamar.totr.common.entity;

import llamar.totr.common.object.TotrEntities;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class Walker extends Monster {
    public Walker(Level pLevel) {
        super(TotrEntities.WALKER.get(), pLevel);
    }
}
