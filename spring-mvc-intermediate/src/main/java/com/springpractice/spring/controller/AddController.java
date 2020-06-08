package com.springpractice.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springpractice.spring.service.AddService;

@Controller
public class AddController 
{
	@Autowired
	private AddService addservice;
	
	public AddService getAddservice() {
		return addservice;
	}

	public void setAddservice(AddService addservice) {
		this.addservice = addservice;
	}


	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) 
	{
		
		//AddService addservice=new AddService();
		int k=addservice.add(i,j);
		//int k=i+j;
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result", k);
		
		return mv;
	}
}
