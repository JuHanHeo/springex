package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	/* request mapping method 단독 매핑*/
	@ResponseBody
	@RequestMapping("/main")
	public String main(){
		
		return "MainController:main()";
	}
	/* method 단독 매핑 필요한 만큼 url을 만들어낸다*/
	@ResponseBody
	@RequestMapping("/main2/a/b/c")
	public String main2(){
		
		return "MainController:main()";
	}

}
