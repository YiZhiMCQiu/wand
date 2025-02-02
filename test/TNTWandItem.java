package com.eihei.wand.items;

import net.minecraft.client.renderer.entity.TntMinecartRenderer;
import net.minecraft.commands.arguments.NbtPathArgument;
import net.minecraft.nbt.NbtIo;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.TntBlock;

public class TNTWandItem extends Item {
    public TNTWandItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand useHand) {
        if (level.isClientSide()) {
            level.addFreshEntity(TntBlock., NbtIo.);
        }
        return InteractionResultHolder.success(player.getItemInHand(useHand));
    }
}
