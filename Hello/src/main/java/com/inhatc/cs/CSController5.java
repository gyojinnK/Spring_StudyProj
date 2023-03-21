package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inhatc.domain.ProductVO;

@Controller
public class CSController5 {

	@RequestMapping("doJSON")
	public @ResponseBody ProductVO doJSON() {	// RespnseBody는 자체를 떨구겠
		ProductVO prod = new ProductVO("Gyojin", 9000);
		System.out.println("doJSON Called~~~~~~~~");
		
		return prod;
	}
}