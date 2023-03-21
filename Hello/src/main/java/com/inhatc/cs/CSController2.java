package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CSController2 {
	@RequestMapping("doC")
	public String doC(  @ModelAttribute("msg") String msg  ) {
							// 사용자가 넘겨준 값 msg를 "msg"로 받아 String 변수 msg에 넣는다.
		System.out.println("doC Called~~~~~~~~~");
		return "result";	// => result.jsp
		
	}
}
