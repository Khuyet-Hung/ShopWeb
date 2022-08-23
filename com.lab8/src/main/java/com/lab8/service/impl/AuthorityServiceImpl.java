package com.lab8.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab8.dao.AccountDAO;
import com.lab8.dao.AuthorityDAO;
import com.lab8.entity.Account;
import com.lab8.entity.Authority;
import com.lab8.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService{
	@Autowired
	AuthorityDAO dao;
	@Autowired
	AccountDAO acdao;
	
	
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = acdao.getAdministrators();
		return dao.authoritiesOf(accounts);
	} 
	
	public List<Authority> findAll() {
		return dao.findAll();
	}

	public Authority create(Authority auth) {
		return dao.save(auth);
	}

	public void delete(Integer id) {
		dao.deleteById(id);
	}

}
