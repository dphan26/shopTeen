package com.example.shopTeen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shopTeen.entity.Banner;



@Repository
public interface BannerRepository extends JpaRepository<Banner, Integer>{

}
