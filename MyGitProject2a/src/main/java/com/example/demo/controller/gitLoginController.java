package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitLoginController {

	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String login() {
		return "gitlogin";
	}
	
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.POST)
	public String login(String id,String pw) {
		
		if("gitlogin".equals(id)&&"gitpw".equals(pw)) {
			return "redirect:/gititemlist";
		}else {
			return"redirect:/gitpralogin";
		}		
	}
	
}
