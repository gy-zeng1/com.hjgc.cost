package com.hjgc.cost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	private String index(ModelMap modelMap){
		modelMap.put("msg", "this is hellopage");
		return "hello";
	}

}
