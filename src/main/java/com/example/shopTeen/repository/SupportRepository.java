package com.example.shopTeen.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.shopTeen.entity.Support;



@Repository
public interface SupportRepository extends JpaRepository<Support, Integer>{
	 
		@Query("SELECT a FROM Support a WHERE a.isActive = True ORDER BY a.position ASC") 
		List<Support> LstSupport();
		
		List<Support> findAllByOrderByPositionAsc();
		
		
}
