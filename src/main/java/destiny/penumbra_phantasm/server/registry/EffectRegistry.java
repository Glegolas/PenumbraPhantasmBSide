package destiny.penumbra_phantasm.server.registry;

import destiny.penumbra_phantasm.PenumbraPhantasm;
import destiny.penumbra_phantasm.server.effect.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectRegistry {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PenumbraPhantasm.MODID);

    public static final RegistryObject<MobEffect> IMAGINARY_FOOD_SICKNESS =
            EFFECTS.register("imaginary_food_sickness", () -> new ImaginaryFoodSickness(MobEffectCategory.NEUTRAL, 1)
        );

    public static void register(IEventBus eventBus) {
        EFFECTS.register(eventBus);
    }
}
