package com.cg.service;

import com.cg.entity.Author;

public interface AuthorService {

	boolean create(Author author);

	Author getAut(int nextInt);

	boolean update(Author author);

	boolean delete(Author author);

}
