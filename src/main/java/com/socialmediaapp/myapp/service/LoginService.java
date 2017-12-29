package com.socialmediaapp.myapp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialmediaapp.myapp.da.LoginDataObject;
import com.socialmediaapp.myapp.domain.User;

@Service
public class LoginService 
{
	@Autowired 
	private LoginDataObject loginDataObject;
	
	public User isUserNamePasswordValid(User user)
	{
		// does not invoke null pointer exception
		// Avoid data layer access
		if("".equals(user.getUsername()) || "".equals(user.getPassword()))
		{
			return null;
		}
		
		User userFromDatabase = loginDataObject.getUser(user);
		
		return userFromDatabase;
	}
}

