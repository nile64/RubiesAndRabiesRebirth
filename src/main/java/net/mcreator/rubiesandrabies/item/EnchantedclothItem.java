package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class EnchantedclothItem extends Item {
	public EnchantedclothItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}