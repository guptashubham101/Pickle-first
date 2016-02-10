package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/index")
	public String index()
	{
		return "home";
	}
	
	@RequestMapping("/login")
	public String userLogin(){
		return "redirect:/index.html?param=show";
	}
	

}
