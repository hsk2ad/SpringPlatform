package com.samkim.controllerpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello() {
		return "showPerson.jsp";
	}
}
