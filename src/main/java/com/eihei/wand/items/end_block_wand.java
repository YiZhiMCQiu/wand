package com.eihei.wand.items;

import com.eihei.wand.wand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = wand.MODID)
public class end_block_wand extends Item {
    public end_block_wand(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
        if (level.isClientSide()) {
            HitResult hitResult = player.pick(50,0,false);
            Vec3 location = hitResult.getLocation();
            player.teleportTo(location.x, location.y, location.z);
        }
        return InteractionResultHolder.success(player.getItemInHand(useHand));
    }
}