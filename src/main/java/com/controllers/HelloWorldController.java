package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@GetMapping("/hellosanat")
	public String helloWorld()
	{
		return "hello-world";
	}
	
	@ResponseBody
	@GetMapping("/hello")
	public String hello()
	{
		return "hello everyone";
	}
	
	@ResponseBody
	@GetMapping("/bye")
	public String bye()
	{
		return "Bye bye everyone";
	}

}
