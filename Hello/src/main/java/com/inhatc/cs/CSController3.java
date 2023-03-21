package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inhatc.domain.ProductVO;
import com.inhatc.domain.MemberVO;

@Controller
public class CSController3 {
	
	@RequestMapping("doD")
	public String doD(  Model model  ) {
		
		System.out.println("doD Called~~~~~~~~~");
		ProductVO prod = new ProductVO("inhatc Product", 5000);
		
		model.addAttribute(prod);
		
		return "productDetail";		// -> productDetail.jsp
	}
	
	@RequestMapping("doE")
	public String doE(  Model model  ) {
		
		System.out.println("doE Called~~~~~~~~~");
		MemberVO mem = new MemberVO("Kang gyo jin");
		
		model.addAttribute(mem);
		
		return "memberinfo";
		
	}
}
