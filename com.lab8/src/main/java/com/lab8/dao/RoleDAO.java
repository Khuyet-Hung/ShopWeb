package com.lab8.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab8.entity.Product;
import com.lab8.entity.Role;

public interface RoleDAO extends JpaRepository<Role, Integer>{

}
