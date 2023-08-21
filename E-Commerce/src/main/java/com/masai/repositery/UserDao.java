package com.masai.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.entity.User;


public interface UserDao extends JpaRepository<User, Long>{

	public User findByEmail(String email);
}
