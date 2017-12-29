package com.socialmediaapp.myapp.domain;

public class Message 
{
	private Long id;
	private String content;
	
	public Message(Long id, String content)
	{
		this.id= id;
		this.content=content;
	}
	
	public Long getId() 
	{
		return id;	
	}
	public void setId(Long id) 
	{
		this.id = id;
	}
	public String getContent() 
	{
		return content;
	}
	public void setContent(String content) 
	{
		this.content = content;
	}
}
