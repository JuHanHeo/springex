package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	/*실제 url파라미터와 메소드 파라미터가 같으면 생략가능 (권장함!!!)*/
	@ResponseBody
	@RequestMapping("/write")
	public String write(@RequestParam("name") String name){
		
		System.out.println("name:"+name);
		return "BoardController:write="+name;
	}
	
	
	/*실제 url파라미터와 메소드 파라미터가 같으면 생략가능*/
	@ResponseBody
	@RequestMapping("/write2")
	public String write2(@RequestParam String name){
		
		System.out.println("name:"+name);
		return "BoardController:write";
	}
	
	
	/*url에 파라미터가 안넘어오는 경우 디폴트 값 지정 가능*/
	/*age가 int로 써져 있으모로 자동으로 형변환 해줌(RequestParam 속성값들은 스트링으로 해줘야됨)*/
	@ResponseBody
	@RequestMapping("/write3")
	public String write3(@RequestParam(value="n", required=true, defaultValue="default") String name, @RequestParam(value="age", required=true, defaultValue="-1") int age){
		
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		return "BoardController:write";
	}
}
