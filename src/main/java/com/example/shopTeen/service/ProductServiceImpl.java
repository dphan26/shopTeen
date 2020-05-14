package com.example.shopTeen.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopTeen.entity.DisplayPosition;
import com.example.shopTeen.entity.Product;
import com.example.shopTeen.entity.ProductDisplay;
import com.example.shopTeen.repository.DisplayPositionRepository;
import com.example.shopTeen.repository.ProductRepository;
import com.example.shopTeen.util.MyConvert;
import com.example.shopTeen.vm.ProductVM;


import antlr.StringUtils;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired 
	private ProductRepository productRepository;
	@Autowired
	private DisplayPositionRepository displayPositionRepository;
	@Override
	public List<ProductVM> listHome() {
		List<Product> listProduct = productRepository.getProductHome();
		List<ProductVM> productvm = new ArrayList<>();
		ProductVM pv ;			   	
		for (Product p : listProduct) {
			pv = productDetailVM(p.getId());
			
			//
			productvm.add(pv);
			
		}
		return productvm;
	}
	
	@Override
	public List<ProductVM> lstProductHome(int position) {
		DisplayPosition dp = displayPositionRepository.findById(position).orElseThrow(null);
		List<ProductDisplay> lst = productRepository.displayHome(dp);	 
		List<ProductVM> rs = new ArrayList<ProductVM>();	
		//get max 12 product to display 1 category
		lst.stream().limit(12)
					.forEach(x -> {
						ProductVM pvm = productDetailVM(x.getProductId().getId());	//id product
						rs.add(pvm);
					});
		
		return rs;
	}
	
	//get information of 1 product
	@Override
	public ProductVM productDetailVM(int id) {
		ProductVM pv = new ProductVM();
		Product p = productRepository.ProductActive(id);
		Date dateNow = new Date();			   
		if (p != null) {
			pv = new ProductVM();
			pv.setProductName(p.getProductName());
			pv.setImgUrl("/data/products/" + p.getId() + "/" + p.getPictureId().getImageUrl());
			
			//
			Float newPrice = p.getUnitPrice();
			Float oldPrice = null;
			if(p.getDiscount() != null) {
				if (p.getDiscount() == 0) {
					newPrice = p.getUnitPrice();
					oldPrice = null;
				}else {
					int compareDate = dateNow.compareTo(p.getDiscountExpiryDate());
					
					if(compareDate <= 0) {
						newPrice =p.getUnitPrice()-(p.getUnitPrice()*p.getDiscount())/100;
						oldPrice = p.getUnitPrice();	
					}
				}
				
			}else {
				newPrice = p.getUnitPrice();
				oldPrice = null;
			}
			
			pv.setNewPrice(newPrice);
			pv.setOldPrice(oldPrice);
			pv.setId(p.getId());
			pv.setLink(MyConvert.convertUrl(p.getProductName()));
			//
			
			return pv;
		}
		else {
			return null;
		}
		
		
		
	}
	
}
