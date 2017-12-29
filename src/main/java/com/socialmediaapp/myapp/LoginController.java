package com.socialmediaapp.myapp;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.socialmediaapp.myapp.domain.User;
import com.socialmediaapp.myapp.service.LoginService;

@Controller
@RequestMapping("/user")	
public class LoginController 
	{
	@Autowired 
	private LoginService loginService;
	
	@RequestMapping(value = "login",	 method = RequestMethod.GET)
	public String login(Locale locale, Model model)
	{
		model.addAttribute("user", new User());
		return "user/login";
	}

	@RequestMapping(value = "login",	 method = RequestMethod.POST)
	public String loginPost(@ModelAttribute("user") User user , Locale locale, Model model) {
  
  User userFromDatabase = loginService.isUserNamePasswordValid(user);
  
  if(userFromDatabase!=null)
  {
    model.addAttribute("user", user);
  	return "Home";
  }
  else
 	{
  	model.addAttribute("result", "invalid username and password");
		return "user/login";
  }
}
	@RequestMapping(value = "register",	 method = RequestMethod.GET)
	public String registerGet(Locale locale, Model model)
	{
		return "user/register";
	}
}
