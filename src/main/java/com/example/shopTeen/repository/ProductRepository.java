package com.example.shopTeen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.shopTeen.entity.DisplayPosition;
import com.example.shopTeen.entity.Product;
import com.example.shopTeen.entity.ProductDisplay;






@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	//
	@Query(value = "SELECT top 12 * FROM Products p", nativeQuery = true)
	List<Product> getProductHome();
	
	@Query("SELECT a FROM ProductDisplay a INNER JOIN Product b ON a.productId = b.id"
			+ " WHERE b.statusId = 1 AND a.isActive = True AND a.displayPositionId = ?1 ORDER BY a.position ASC")	
	List<ProductDisplay> displayHome(DisplayPosition position);	
	
	@Query(value="SELECT * FROM Products p WHERE status_Id = 1 AND p.id = ?1", nativeQuery = true)
	Product ProductActive(int productId);
	
}

