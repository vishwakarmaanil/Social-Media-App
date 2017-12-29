package com.socialmediaapp.myapp;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.socialmediaapp.myapp.domain.User;
 
@Controller
public class HomeController 
	{
	
	@RequestMapping(value = "/login",	 method = RequestMethod.GET)
	public String login(Locale locale, Model model)
	{
	
		populateModel(model);
		model.addAttribute("user", new User());
		return "login";
	
	}

	private void populateModel(Model model) {
		List<String> accountypes = new ArrayList<String>();
		
		accountypes.add("Gold");
		accountypes.add("Silver");
		accountypes.add("Bronze");
		accountypes.add("Platinum");

		model.addAttribute("myaccounttype",accountypes);
	}
	
	@RequestMapping(value = "/login",	 method = RequestMethod.POST)
	public String loginPost(@ModelAttribute("user") User user , Locale locale, Model model) {
  model.addAttribute("user", user);
		populateModel(model);
		return "login";
	}
}
