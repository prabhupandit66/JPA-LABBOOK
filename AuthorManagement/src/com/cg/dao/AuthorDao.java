package com.cg.dao;

import com.cg.entity.Author;

public interface AuthorDao {

	boolean create(Author author);

	Author getAut(int id);

	boolean update(Author author);

	boolean delete(Author author);



}
