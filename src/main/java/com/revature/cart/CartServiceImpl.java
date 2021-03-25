package com.revature.cart;


import javax.jws.WebService;

import com.revature.cart.Item;

@WebService(endpointInterface = "com.revature.cart.CartService", serviceName = "CartService")
public class CartServiceImpl implements CartService {

	@Override
	public String addItem(Item item) {
		String result = "Adding " + item.getItemName() + " to the cart.";
		((Item) item).addItem(item);
		System.out.println(result);
		return result;
	}


	@Override
	public boolean removeItem(Item item) {
			
		String result = "Removing " + item.getItemName() + " from the cart.";
		((Item) item).removeItem(item);
		System.out.println(result);
		return false;
			}

	@Override
	public int itemQuanitity(Item item, String itemName) {
			
		return item.getQuantity();
	}

}