package com.example.shopTeen.service;
import java.util.List;

import org.springframework.validation.BindingResult;

import com.example.shopTeen.entity.TblUser;
import com.example.shopTeen.vm.SignInVM;




public interface UserService {
	   public List<TblUser> getUsers();
	  
	   
//	   public String SignUp(SignUpVM si);
	   
	   public String SignIn(SignInVM si);
	   
	   
	   // check account exist
	   public boolean checkAccountExist(String email);
}
