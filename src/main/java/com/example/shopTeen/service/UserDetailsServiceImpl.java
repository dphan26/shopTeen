package com.example.shopTeen.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.shopTeen.entity.TblUser;
import com.example.shopTeen.entity.UserRole;
import com.example.shopTeen.repository.UserRepository;
import com.example.shopTeen.repository.UserRoleRepository;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserRoleRepository userRoleRepository;
	 @Override
	 @Transactional
	    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		 
	        TblUser user = userRepository.GetByEmail(userName);
	        if (user == null) {
	            throw new UsernameNotFoundException("User not found");
	        }
//
//
	        List<UserRole> ur = userRoleRepository.GetByUserId(user);
	        
	        String email = user.getEmail();
			 String password = user.getPassword();
			// String roleName = ur.getRoleId().getRoleName();
			 
				PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
				String hashedPassword = passwordEncoder.encode("123456");
			 //
			 
			 List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();

//				  String[] roleNames= {"ROLE_ADMIN","ROLE_USER"}
			int urSize = ur != null ? ur.size() : 0;
			 String []  roleNames = new String[urSize + 1]; // 1 là mặc định quyền User
			 roleNames[0] = "ROLE_USER";
			 if (ur != null) {
				
				// roleNames = new String[ur.size()];
				   int i = 1; // i=0 đã có giá trị rồi
					for (UserRole ii : ur) {
						roleNames[i] = ii.getRoleId().getRoleName();
						i +=1;
					}
			}
			
			 
				  
				  for (String role : roleNames) {
		                // ROLE_USER, ROLE_ADMIN,..
		                GrantedAuthority authority = new SimpleGrantedAuthority(role);
		                grantList.add(authority);
		            }
				  
			  UserDetails userDetails = (UserDetails) new User(email, //
					  hashedPassword, grantList);
			  

			  return userDetails;
	    }


}
