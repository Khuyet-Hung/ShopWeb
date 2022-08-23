package com.lab8.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab8.dao.AccountDAO;
import com.lab8.entity.Account;
import com.lab8.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	AccountDAO adao;
	
	
	@Override
	public Account findById(String username) {
		return adao.findById(username).get();
	}


	@Override
	public List<Account> getAdministrators() {
		return adao.getAdministrators();
	}


	@Override
	public List<Account> findAll() {
		return adao.findAll();
	}

}
