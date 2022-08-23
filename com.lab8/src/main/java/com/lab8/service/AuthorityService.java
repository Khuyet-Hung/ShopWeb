package com.lab8.service;

import java.util.List;

import com.lab8.entity.Authority;

public interface AuthorityService {

	public List<Authority> findAuthoritiesOfAdministrators();

	public List<Authority> findAll();

	public Authority create(Authority auth);

	public void delete(Integer id);
}
