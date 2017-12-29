package com.socialmediaapp.myapp.da;

import org.springframework.stereotype.Repository;

import com.socialmediaapp.myapp.domain.User;

@Repository
public class LoginDataObject 
{
	public User getUser(User user)
	{
		// here we query the database for this particular object
		//via incompleteUser.getUsername() method and incompleteUser.getPassword() method.
		User userFromDatabase=  new User();
		userFromDatabase.setUsername("Anilvishwakarma");
		
		return userFromDatabase;
	}
}
