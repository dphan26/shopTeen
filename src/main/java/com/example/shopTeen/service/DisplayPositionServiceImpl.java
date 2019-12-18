package com.example.shopTeen.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopTeen.entity.DisplayPosition;
import com.example.shopTeen.entity.Product;
import com.example.shopTeen.repository.DisplayPositionRepository;
import com.example.shopTeen.repository.ProductRepository;
import com.example.shopTeen.util.MyConvert;
import com.example.shopTeen.vm.ProductVM;

import antlr.StringUtils;
@Service
public class DisplayPositionServiceImpl implements DisplayPositionService{

	@Autowired
	DisplayPositionRepository displayPositionRepository;
	@Override
	public List<DisplayPosition> getAll() {
		return displayPositionRepository.findAll();
		
	}

	
	
	
}
