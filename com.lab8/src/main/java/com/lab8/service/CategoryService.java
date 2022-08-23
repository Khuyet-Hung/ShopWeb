package com.lab8.service;

import java.util.List;

import com.lab8.entity.Category;

public interface CategoryService {

	List<Category> findAll();

	Category create(Category category);

	Category update(Category category);

	void delete(String id);

}
