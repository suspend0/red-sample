package com.sample.red.dto;

import java.util.List;

/**
 * Shopping cart
 * 
 * @author DPavlov
 */
public interface Cart {
	
	List<Item> getItems();
	
	void addItem(String item);
	
	void removeItem(String item);

}
