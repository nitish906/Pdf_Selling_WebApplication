package com.masai.services;

import com.masai.entity.User;
import com.masai.exception.UserExceptation;

public interface UserServices {
	
	public User findUserById(Long userId)throws UserExceptation;

	public User findUserProfileByJwt(String jwt)throws UserExceptation;
	
	
	
}
