package com.lab8.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab8.entity.Category;


public interface CategoryDAO extends JpaRepository<Category, String>{

}
