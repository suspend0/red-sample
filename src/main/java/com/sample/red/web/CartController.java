package com.sample.red.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sample.red.dto.Item;
import com.sample.red.service.CartService;

/**
 * Basic controller
 * 
 * @author DPavlov
 */
@Controller
public class CartController {
	
	private CartService cartService;
	
	private int counter = 1;

	@Autowired
	public CartController(CartService cartService) {
		this.cartService = cartService;
	}
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public ModelAndView getCart() {
		
		final List<Item> list = cartService.getItemsInCart();
		ModelAndView mav = new ModelAndView("cart");
		mav.addObject("items", list);
		mav.addObject("add", "Item" + counter++);
		return mav;
		
	}
	
	@RequestMapping(value = "/cart/addtocart/{item}", method = RequestMethod.GET)
	public ModelAndView addToCart(@PathVariable final String item) {
		
		cartService.addToCart(item);
		return getCart();
		
	}
	
	@RequestMapping(value = "/cart/removefromcart/{item}", method = RequestMethod.GET)
	public ModelAndView removeFromCart(@PathVariable final String item) {
		
		cartService.removeFromCart(item);
		return getCart();
		
	}
	

}
