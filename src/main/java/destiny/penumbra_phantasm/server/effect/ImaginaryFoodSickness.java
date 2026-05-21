package destiny.penumbra_phantasm.server.effect;

import java.util.List;
import java.util.ArrayList;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class ImaginaryFoodSickness extends MobEffect {
    public ImaginaryFoodSickness(MobEffectCategory category, int color) {super(category, color);}

    public List<ItemStack> getCurativeItems() {
        return new ArrayList<ItemStack>();
    }
}
