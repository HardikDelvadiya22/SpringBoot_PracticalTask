package net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.model.Customer;
import net.service.ProductService;

 

@Controller
public class ProductController {


	@Autowired
	private ProductService productService;
	
	@GetMapping("/getAllProduct")
	public String getProduct() {
	 
		this.productService.getProduct();
		return "redirect:/";
	}
}
