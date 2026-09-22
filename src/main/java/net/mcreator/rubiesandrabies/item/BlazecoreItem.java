package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class BlazecoreItem extends Item {
	public BlazecoreItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}