package com.example.shopTeen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.shopTeen.entity.TblUser;
import com.example.shopTeen.entity.UserRole;



@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer>{
	
	@Query("SELECT a FROM UserRole a WHERE a.userId =?1")
	List<UserRole> GetByUserId(TblUser user);
}
