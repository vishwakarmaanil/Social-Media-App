package com.socialmediaapp.myapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.socialmediaapp.myapp.da.MessageDataObject;
import com.socialmediaapp.myapp.domain.Message;

@Controller
@RequestMapping("/app")
public 	class HomeController {
	
	@Autowired
	MessageDataObject messageDataObject;
	@RequestMapping(value ="home", method=RequestMethod.GET)
	public String homeGet(ModelMap model)
	{
		List<Message> messages = messageDataObject.getMessage();
		model.addAttribute("messages",messages);
		return "app/home";
	}
	
	@RequestMapping(value ="home/{messageId}", method=RequestMethod.GET)
	public String homeGetMessageById(@PathVariable("messageId") Long messageId, ModelMap model)
	{
		Message messageById = messageDataObject.getMessageById(messageId);
		List<Message> messages = new ArrayList<Message>();
		messages.add(messageById);
		model.put("messages", messages);
		return "app/home";
	}
}
