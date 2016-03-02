package com.test.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoAction {

	@RequestMapping("/test")
	public ModelAndView entry(){
		
		ModelAndView model = new ModelAndView();
		model.setViewName("helloworld");
		model.addObject("id", "123");
		model.addObject("name", "test");
		model.addObject("lastName", "demo");
		model.addObject("startDate", "2016-03-02");
		model.addObject("endDate", "2016-03-03");
		return model;
	}
}
