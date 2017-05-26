package com.jx372.springex.controller;

import java.io.Writer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(){
		return "/WEB-INF/views/index.jsp";
	}

	@RequestMapping("/hello2")
	public ModelAndView hello2( @RequestParam("n") String name ) {

		ModelAndView mav = new ModelAndView();
		mav.addObject( "name", name );
		mav.setViewName( "/WEB-INF/views/index.jsp" );

		return mav;

	}
	
	/*기술이 침투 되었기때문에 비추천*/
	@RequestMapping("/hello3")
	public String hello3(Model model, @RequestParam("n") String name){
		
		model.addAttribute("name", name);
		return "/WEB-INF/views/hello.jsp";
		
//		String name = request.getParameter("name");
//		try {
//			out.write("<h1>Hello" + name + "</h1>");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return "";
	}
}
