package com.exampl.rest.model;

public class User 
{
	private final long id;
	private final String content;
	
	public User(long id, String content)
	{
		this.content = content;
		this.id = id;
	}
	
	public String getContent()
	{
		return this.content;
	}
	
	public long id()
	{
		return this.id;
	}
}
