package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*request mapping (type 단독매핑)*/
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	
	
	/*RequestMapping 내용 생략하면 메소드 명으로 실행됨 /guestbook/list*/
	/*명시적으로 적어주는게 좋음 그냥 알아만 두셈*/
	@ResponseBody
	@RequestMapping
	public String list(){
		return "GuestBookController:list()";
	}
	
}
