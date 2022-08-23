package com.lab8.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab8.dao.RoleDAO;
import com.lab8.entity.Role;
import com.lab8.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleDAO dao;

	@Override
	public List<Role> findAll() {
		return dao.findAll();
	}
}
