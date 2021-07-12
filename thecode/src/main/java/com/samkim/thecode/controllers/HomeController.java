package com.samkim.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	private Boolean isCorrectCode(String guess) {
		return guess.equals("bushido");
	}
	
	private String[] answers(){
		return new String[] {
				"Loyalty", "Courage", "Veracity", "Compassion", "Honor"
		};
	}
	
	@RequestMapping("/")
	public String Index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/attempt", method=RequestMethod.POST)
	public String Attempt(@RequestParam(value="guess") String guess, Model model) {
		if(isCorrectCode(guess)) {
			return "redirect:/code";
		}
		model.addAttribute("errors", "You do not know the way");
		return "index.jsp";
	}
	@RequestMapping("/code")
	public String Code(Model model) {
		model.addAttribute("tenets", answers());
		return "code.jsp";
	}

}
