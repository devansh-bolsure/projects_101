package com.springboot.web.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.web.entities.User;
import java.util.List;


public interface UserRepository extends CrudRepository<User, Integer>
{
	public List<User>  findByName(String name);
	public List<User> findByCityAndStatus(String city,String Status);
	
	@Query("select u from User u where u.name=:n")
	public List<User> getAllUser(@Param("n") String name);
	
}
