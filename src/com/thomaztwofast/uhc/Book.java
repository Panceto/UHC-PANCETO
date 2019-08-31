

package com.thomaztwofast.uhc;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import com.thomaztwofast.uhc.lib.F;

public class Book {
	private Main pl;
	public ItemStack itemStack;

	public Book(Main pl) {
		this.pl = pl;
	}

	public void load() {
		itemStack = F.item(Material.WRITTEN_BOOK, pl.config.boolTitle, pl.config.bookLore);
		BookMeta meta = (BookMeta) itemStack.getItemMeta();
		meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		meta.setAuthor(pl.getDescription().getName());
		meta.setTitle(pl.config.boolTitle);
		meta.setPages(pl.config.bookPages);
		itemStack.setItemMeta(meta);
	}
}
