package com.sample.red.service;

import java.util.List;

import com.sample.red.dto.Item;

/**
 * Cart service.
 * 
 * @author DPavlov
 */
public interface CartService {
	
	List<Item> getItemsInCart();
	
	void addToCart(String item);
	
	void removeFromCart(String item);

}
