package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gitItemEditController {

	@RequestMapping(path = "/gititemedit", method = RequestMethod.GET)
	public String gititemEditGet(String item_name, String price) {

		return "gititemedit";
	}

	@RequestMapping(path = "/update", method = RequestMethod.POST)
	public String gititemEditPost(Model model, String item_name, String price) {

		model.addAttribute("itemname", item_name);
		model.addAttribute("price", price);
		return "update";
	}

}
