package com.sample.red.service.impl;

import java.util.List;

import com.sample.red.dto.Cart;
import com.sample.red.dto.Item;
import com.sample.red.service.CartService;

/**
 * Web implementation of cart service
 * 
 * @author DPavlov
 */
public class WebCartService implements CartService
{

	private final Cart cart;

	public WebCartService(final Cart cart) {
		this.cart = cart;
	}

	public void addToCart(String item) {
		cart.addItem(item);
	}

	public List<Item> getItemsInCart() {
		return cart.getItems();
	}

	public void removeFromCart(String item) {
		cart.removeItem(item);
	}
	
	
	
}
