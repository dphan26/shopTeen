package com.example.shopTeen.controller;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;



import com.example.shopTeen.service.UserService;

import com.example.shopTeen.vm.SignInVM;





@RestController
public class RestUserController {
	@Autowired
	private UserService userService;
	@PostMapping("/users/signin")
    public String SignIn(SignInVM signInVM) {
		String rs = userService.SignIn(signInVM);
        return rs;
    }
	
}
