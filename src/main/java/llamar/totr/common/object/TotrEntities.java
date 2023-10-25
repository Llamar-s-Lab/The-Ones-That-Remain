package llamar.totr.common.object;

import llamar.totr.TotrMain;
import llamar.totr.common.entity.Walker;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TotrEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TotrMain.MODID);

    public static final RegistryObject<EntityType<Walker>> WALKER = ENTITY_TYPES.register("walker", () ->
            EntityType.Builder.of((EntityType.EntityFactory<Walker>) (entityType, level) ->
                    new Walker(level), MobCategory.CREATURE).build(TotrMain.MODID + ":walker"));
}
