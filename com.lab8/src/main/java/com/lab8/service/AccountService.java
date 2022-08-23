package com.lab8.service;

import java.util.List;

import com.lab8.entity.Account;

public interface AccountService {
	Account findById(String username);

	List<Account> getAdministrators();

	List<Account> findAll();
}
