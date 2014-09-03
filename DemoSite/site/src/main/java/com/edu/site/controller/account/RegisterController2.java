package com.edu.site.controller.account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController2 {
	@RequestMapping(value="/register")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response){
		ModelAndView model = new ModelAndView();
		model.setViewName("views/register");
		return model;
	}

}
