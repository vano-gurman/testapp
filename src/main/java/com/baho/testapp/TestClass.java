package com.baho.testapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestClass {

	@GetMapping("/home")
	public String home1() {
		return "home";
	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
	        Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/addition")
	public String addition() {
		return "addition";
	}

	@GetMapping("/calculations")
	public String calculations(@RequestParam(name = "firstNumber") int firstNumber,
	        @RequestParam(name = "secondNumber") int secondNumber, Model model) {
		model.addAttribute("sum", firstNumber + secondNumber);
		return "calculations";
	}

	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
