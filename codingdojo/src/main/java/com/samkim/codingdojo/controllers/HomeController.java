package com.samkim.codingdojo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/coding")
		public String hello() {
			return "Hello Coding Dojo!";
		}
	@RequestMapping("/coding/python")
		public String python() {
			return "Python/Django is better!";
		}
	@RequestMapping("/coding/java")
		public String java() {
			return "Java/Spring is better!";
		}
	
}
