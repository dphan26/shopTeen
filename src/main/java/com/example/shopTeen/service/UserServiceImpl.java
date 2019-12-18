package com.example.shopTeen.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.shopTeen.entity.TblUser;
import com.example.shopTeen.repository.UserRepository;
import com.example.shopTeen.util.MySecurity;
import com.example.shopTeen.vm.SignInVM;


@Service
public class UserServiceImpl implements UserService {
	
//	private GenderRepository genderRepository;
	@Autowired
	private UserRepository userRepository;
	

	
	@Override
	public String SignIn(SignInVM si) {
		String rs = "";
	//	rs = si.getEmail() == null || si.getEmail() == "" || si.getPassword() == null || si.getEmail() == "" ? "Null" : "";
		boolean checkAccountExist = checkAccountExist(si.getEmail());
		if (!checkAccountExist) {
			rs = "NotFound";
		}
		else {
			TblUser user = userRepository.findByEmail(si.getEmail());
			String enpass = MySecurity.EncryptPassword(si.getPassword());
			if (user.getPassword().equals(enpass)) {
				if (user.getStatusId().getId() == 1) { //1 = active
					//ok
					rs="OK";
					//rs= user.getPassword();
				}
				else {
					rs = "Blocked";
				}
			}
			else {
				rs = "NotPassword";
			}
			
		}
		// TODO Auto-generated method stub
		return rs;
	}
	@Override
	public boolean checkAccountExist(String email) {
		 boolean rs = false;
         TblUser lst = userRepository.findByEmail(email);
         if (lst != null) {
			rs = true; // tồn tại
		}
         return rs;
         
		
		
	}
	@Override
	public List<TblUser> getUsers() {
		return userRepository.findAll();
	}
	

}
