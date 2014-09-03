package com.edu.site.controller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.edu.site.util.Keys;

@Controller
public class ProductController {
	/****
	 * 商品详情
	 * @return
	 */
	@RequestMapping(value="/pinfo")
	public ModelAndView findProductInfo(){
		ModelAndView model = new ModelAndView();
		model.setViewName(Keys.url+"/single");
		return model;
		
	}

}
