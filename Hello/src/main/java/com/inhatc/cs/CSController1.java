package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CSController1 {
	
	@RequestMapping("/doA")
	public void doA() {
		System.out.println("doA Called~~~~~~~~~~~~~");
	}
	
	@RequestMapping(value = "/doB", method = RequestMethod.GET)
	public String doB() {
		System.out.println("doB Called~~~~~~~~~~~~~");
		return "doBresult";
	}
}