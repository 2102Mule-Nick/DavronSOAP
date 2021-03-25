package com.revature.cart;


import javax.jws.WebMethod;
import javax.jws.WebService;

//import com.revature.pojo.Person;

@WebService
public interface CartService {

	@WebMethod
	String addItem(Item item);
	
	@WebMethod
	boolean removeItem(Item item);
	
	@WebMethod
	int itemQuanitity(Item item, String itemName);
}