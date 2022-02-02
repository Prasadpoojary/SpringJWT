package com.prasad.dau;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.prasad.model.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	
	User findByUsername(String username);
}
