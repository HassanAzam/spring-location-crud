package com.hassan.locationcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/showCreate")
public class LocationController {
	
	@GetMapping
	public String showCreate() {
		return "createLocation";
	}
}
