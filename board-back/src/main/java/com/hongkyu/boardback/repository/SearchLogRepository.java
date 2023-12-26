package com.hongkyu.boardback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hongkyu.boardback.entity.SearchLogEntity;

public interface SearchLogRepository extends JpaRepository<SearchLogEntity, Integer>{
    
} 
