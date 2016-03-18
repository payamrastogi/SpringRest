package com.exampl.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.exampl.rest.model.User;

@RestController
public class SpringController 
{
	private static final String template ="Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public User getResponse(@RequestParam(value="name", defaultValue="World")String name)
	{
		return new User(counter.getAndIncrement(), String.format(template, name));
	}
}
