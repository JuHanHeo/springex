package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*request mapping (type + method)*/
@Controller
@RequestMapping("/user")
public class UserController {
	
	@ResponseBody
	@RequestMapping("/joinform")
	public String joinFrom(){
		
		return "UserController:joinFrom";
	}
	
	/*method = get방식으로 들어오면 얘를 실행해라*/
	@RequestMapping(value =  "/login", method = RequestMethod.GET)
	public String login(){
		return "/WEB-INF/views/login.jsp";
	}
	
	/*method = get방식으로 들어오면 얘를 실행해라*/
	@ResponseBody
	@RequestMapping(value =  "/login", method = RequestMethod.POST)
	public String login(String email, String password){
		return "UserController:loginFrom";
	}
	
//	@ResponseBody
	@RequestMapping(value =  "/loginvo", method = RequestMethod.GET)
	public String login(@ModelAttribute UserVo userVo){
		System.out.println(userVo);
		return "redirect:/main";
	}
	
	@ResponseBody
	@RequestMapping("/view/{no}")
	public String view(@PathVariable("no") int no){
		
		return "BoardController:view("+no+")";
	}
	
	
	
}
