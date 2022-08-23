package com.lab8.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab8.dao.CategoryDAO;
import com.lab8.entity.Category;
import com.lab8.entity.Product;
import com.lab8.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDAO cdao;
	
	@Override
	public List<Category> findAll() {
		return cdao.findAll();
	}

	@Override
	public Category create(Category category) {
		return cdao.save(category);
	}

	@Override
	public Category update(Category category) {
		return cdao.save(category);
	}

	@Override
	public void delete(String id) {
		cdao.deleteById(id);
	}
	
}
