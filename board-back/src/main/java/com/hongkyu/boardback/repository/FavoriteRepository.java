package com.hongkyu.boardback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hongkyu.boardback.entity.FavoriteEntity;

public interface FavoriteRepository extends JpaRepository<FavoriteEntity, String>{

} 
