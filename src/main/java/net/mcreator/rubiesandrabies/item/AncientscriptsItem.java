package net.mcreator.rubiesandrabies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AncientscriptsItem extends Item {
	public AncientscriptsItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}