package com.revature.cart;

import java.util.LinkedList;
import java.util.List;

import com.revature.cart.Item;

public class Item {

	private final static List<Item> ITEM_LIST = new LinkedList<>();
	public static List<Item> getItemList() {
		return ITEM_LIST;
	}

	private String itemName;
	private int itemID;
	private int quantity;
	
	public static void addItem(Item item) {
		ITEM_LIST.add(item);
	}
	
	public static void removeItem(Item item) {
		ITEM_LIST.remove(item);
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemID=" + itemID + "]";
	}
	

	
}
