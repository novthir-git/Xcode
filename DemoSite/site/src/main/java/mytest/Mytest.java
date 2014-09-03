package mytest;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mytest.dao.TestDaoImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mytest {
	@Resource
	private TestDaoImpl testDao;
	
	@RequestMapping(value="/s/t")
	public ModelAndView tt(HttpServletRequest request, HttpServletResponse response){
		    System.out.println("啊啊啊啊");
		    ModelAndView model = new ModelAndView();
		    model.setViewName("xx/xxx");
		    request.setAttribute("tt", "11111111111111");
		    
			return model;
		
	}
	/*****
	 * 测试连接数据库的方法
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/s/y")
	public ModelAndView yy(HttpServletRequest request, HttpServletResponse response){
		    System.out.println("啊啊啊啊");
		    ModelAndView model = new ModelAndView();
		    model.setViewName("views/cc");
		    request.setAttribute("tt", "11111111111111");
		    this.testDao.find();
			return model;
		
	}
	
	@RequestMapping(value="/s/z")
	public ModelAndView zz(HttpServletRequest request, HttpServletResponse response){
		    System.out.println("啊啊啊啊");
		    ModelAndView model = new ModelAndView();
		    model.setViewName("views/zz");
		    request.setAttribute("tt", "11111111111111");
		    
			return model;
		
	}

}
