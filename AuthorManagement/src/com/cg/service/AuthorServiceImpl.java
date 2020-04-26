package com.cg.service;

import com.cg.dao.AuthorDao;
import com.cg.dao.AuthorDaoImpl;
import com.cg.entity.Author;

public class AuthorServiceImpl implements AuthorService {
private AuthorDao adao=new AuthorDaoImpl();
	@Override
	public boolean create(Author author) {
       return adao.create(author);
		
	}
	@Override
	public Author getAut(int id) {
		// TODO Auto-generated method stub
		return adao.getAut(id);
	}
	@Override
	public boolean update(Author author) {
		// TODO Auto-generated method stub
		return adao.update(author);
	}
	@Override
	public boolean delete(Author author) {
		// TODO Auto-generated method stub
		return adao.delete(author);
	}

}
