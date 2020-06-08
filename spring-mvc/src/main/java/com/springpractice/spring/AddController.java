package com.springpractice.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController 
{

	@RequestMapping("/add")
	public String add() 
	{
		//System.out.println("I am here.");
		return "display.jsp";
	}
}
