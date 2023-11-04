package com.springboot.RestApi.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.RestApi.entities.Books;
import java.util.List;


public interface BookRepository extends CrudRepository<Books, Integer> 
{
 public Books  findById(int id);
}
