package com.springpractice.spring.service;

import org.springframework.stereotype.Controller;

@Controller
public class AddService 
{
	public int add(int i, int j) 
	{
		int k=i+j;
		System.out.println("At AddService result="+k);
		return k;
	}
}
