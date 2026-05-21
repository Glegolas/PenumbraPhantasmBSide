package destiny.penumbra_phantasm.server.item;
import destiny.penumbra_phantasm.server.registry.EffectRegistry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.entity.player.Player;


public class DarkWorldFoodItem extends Item {
    // private final FoodProperties foodProperties = new FoodProperties.Builder().nutrition(4).saturationMod(0.5f).fast().effect(() -> new MobEffectInstance(EffectRegistry.IMAGINARY_FOOD_SICKNESS.get(), 3), 0.8f).build();
    public DarkWorldFoodItem(Item.Properties pProperties) {
        super(pProperties);
    }

    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
      ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);
      if (pPlayer.hasEffect(EffectRegistry.IMAGINARY_FOOD_SICKNESS.get()) == false && itemstack.isEdible()) {
        if (pPlayer.canEat(itemstack.getFoodProperties(pPlayer).canAlwaysEat())) {
            pPlayer.startUsingItem(pUsedHand);
        return InteractionResultHolder.consume(itemstack);
        } else {
        return InteractionResultHolder.fail(itemstack);
        }
      } else {
         return InteractionResultHolder.pass(pPlayer.getItemInHand(pUsedHand));
      }
   }
}