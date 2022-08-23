package com.lab8.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lab8.entity.Order;


public interface OrderDAO extends JpaRepository<Order, Long>{

	@Query("SELECT o FROM Order o where o.account.username=?1")
	List<Order> findByUsername(String username);

}
