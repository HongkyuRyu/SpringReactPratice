package com.hongkyu.boardback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hongkyu.boardback.entity.ImageEntity;

public interface ImageRepository extends JpaRepository<ImageEntity, Integer> {
    
} 
