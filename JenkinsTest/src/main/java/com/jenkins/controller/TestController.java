package com.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/")
	@ResponseBody
	public String test(Model model) {
		// ㄴㄴㄴㄴ
		return "jenkins test";   
	}
}
