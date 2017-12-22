package com;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping("/")
	public String index()
	{
	
		return "index";
	}
	@RequestMapping(value="/goToSignUp",method=RequestMethod.GET)
	public ModelAndView goTOSignUP()
	{
		ModelAndView mv= new ModelAndView();

		mv.setViewName("SignUP");
		return mv;
		
		
	}
	@RequestMapping(value="/goToLogin",method=RequestMethod.GET)
	public ModelAndView goTOLogin()
	{
		ModelAndView mv= new ModelAndView();

		mv.setViewName("Login");
		return mv;
		
		
	}

	

}
