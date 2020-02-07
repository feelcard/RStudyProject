package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("main.mc")
	public ModelAndView maingo(ModelAndView mv) {
		
		mv.setViewName("main");
		return mv;
		
	}
	@RequestMapping("aboutgo.mc")
	public ModelAndView aboutgo(ModelAndView mv) {
		
		mv.setViewName("about");
		return mv;
		
	}
	@RequestMapping("productsgo.mc")
	public ModelAndView productsgo(ModelAndView mv) {
		
		mv.setViewName("products");
		return mv;
		
	}
	@RequestMapping("storego.mc")
	public ModelAndView storego(ModelAndView mv) {
		
		mv.setViewName("store");
		return mv;
		
	}
}
