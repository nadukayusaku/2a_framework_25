package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gititemListController {

	@RequestMapping(path = "/gititemlist", method = RequestMethod.GET)
	public String itemlist() {
		return "gititemlist";
	}
}
