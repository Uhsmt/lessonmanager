package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
//
//	@Controller
//	public class HelloSpringBootWebController {
//	    @RequestMapping(value="/", method=RequestMethod.GET)
//	    public ModelAndView index(ModelAndView mv) {
//	        mv.setViewName("index");
//	        return mv;
//	    }
//
//	    @RequestMapping(value="/result", method=RequestMethod.POST)
//	    public ModelAndView send(@RequestParam("inputvalue")String inputvalue, ModelAndView mv) {
//	        mv.setViewName("result");
//	        mv.addObject("message", inputvalue);
//	        return mv;
//	    }
//	}

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView view) {
		view.setViewName("index");
		return view;

	}
	@RequestMapping(value="result", method=RequestMethod.POST)
	public ModelAndView send(@RequestParam("inputvalue")String inputvalue,ModelAndView view) {
		view.setViewName("index");
		view.addObject("message",inputvalue);
		return view;
	}
	@RequestMapping(value="console" ,method=RequestMethod.GET)
	public ModelAndView console(ModelAndView view) {
		view.setViewName("console");
		return view;
	}

}
