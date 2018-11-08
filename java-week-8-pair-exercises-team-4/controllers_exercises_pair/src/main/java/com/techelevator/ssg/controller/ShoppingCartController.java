package com.techelevator.ssg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.ssg.model.store.DollarAmount;
import com.techelevator.ssg.model.store.Product;

@Controller
@SessionAttributes("shoppingCartItem")
public class ShoppingCartController {
	
	@RequestMapping(path="/productList", method=RequestMethod.POST)
	public String addProductToCart(@RequestParam Long id,
								  @RequestParam String name,
								  @RequestParam String description,
								  @RequestParam DollarAmount price,
								  @RequestParam String imageName,
								  ModelMap model) {
		
		Product cartItem = new Product();
		cartItem.setId(id);
		cartItem.setName(name);
		cartItem.setDescription(description);
		cartItem.setPrice(price);
		cartItem.setImageName(imageName);
		model.addAttribute("shoppingCartItem", cartItem);
		
		return "redirect:/productList";
	}
	
	//@RequestMapping(path="/viewCart", method=RequestMethod.GET)
	public String displayShoppingCart() {
		return "xyz";
	}
	
	

}
