package com.lab8.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lab8.entity.Product;
import com.lab8.entity.Products;

public interface ProductsDAO extends JpaRepository<Products, String>{


}
