package com.example.shopTeen.service;

import java.util.List;

import com.example.shopTeen.entity.Product;
import com.example.shopTeen.vm.ProductVM;

public interface ProductService {
	public List<ProductVM> listHome();
	public List <ProductVM> lstProductHome(int position);
	public ProductVM ProductDetailVM(int id);
}
