package com.example.shopTeen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.example.shopTeen.entity.TblUser;



@Repository
public interface UserRepository extends JpaRepository<TblUser, Integer>{
	
	 TblUser findByEmail(String email);
	 
		@Query(value = "SELECT TOP 1 * FROM tbl_users a WHERE a.email = ?1", nativeQuery = true)
		 TblUser GetByEmail(String email);
}
