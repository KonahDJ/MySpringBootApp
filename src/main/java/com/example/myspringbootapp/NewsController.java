package com.example.myspringbootapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/news")
public class NewsController {
	
	@GetMapping(path="/headline")
	@ResponseBody
	public String getLatestBusinessNewsHeadline() {
		return "Nvidia Earnings Are Coming. Why Supply Is Key for the Stock. - Barron's";
	}
	
}
