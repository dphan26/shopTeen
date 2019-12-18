package com.example.shopTeen.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.shopTeen.vm.ProductVM;

@RestController
public class ProductsController {
	@GetMapping("/product/{productName}/{id}")
	 public ModelAndView HomeX(Model model) {
		//List<ProductVM> abc = productService.listHome();
	//	 model.addAttribute("test", abc);	   
		ModelAndView md = new ModelAndView("/products/detail");
		 return md;
	}
}
