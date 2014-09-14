package com.edu.site.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*****
 * 首页
 * @author linfanhe
 * 20140901
 *
 */
@Controller
public class IndexWebController {
	@RequestMapping(value="/i")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
		ModelAndView model = new ModelAndView();
		model.setViewName("views/index");
		return model;
		
	}
	
	

}
