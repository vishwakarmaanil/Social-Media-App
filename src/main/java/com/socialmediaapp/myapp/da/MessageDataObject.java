package com.socialmediaapp.myapp.da;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.socialmediaapp.myapp.domain.Message;

@Repository
public class MessageDataObject {

	private List<Message> messages = new ArrayList<Message>();
	
	public MessageDataObject()
	{
		addMessageToList("Message 1", 1L);
		addMessageToList("Message 2", 2L);
		addMessageToList("Message 3", 3L);
		addMessageToList("Message 4", 4L);
	}
 	
	public List<Message> getMessage()
	{
		return messages;
	}

	private void addMessageToList(String content, Long id) 
	{
		Message message = new Message(id, content);
		messages.add(message);
	}

	public Message getMessageById(Long messageId) {
		for(Message message: messages)
		{
			if(message.getId().equals(messageId))
			{
				return message;
			}
		}
		return null;
	}
}
