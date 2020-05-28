package com.example.shopTeen.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class ProductsController {
	//@GetMapping("/product/{productName}/{id}")
	@GetMapping("/product/{id}")
	 public String HomeX(Model model) {
		//List<ProductVM> abc = productService.listHome();
	//	 model.addAttribute("test", abc);	   
		//json ket qua
		//list 
	return "/products/index_P";
	}
	

	
}
