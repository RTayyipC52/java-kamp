package kamp.northwind.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kamp.northwind.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
}