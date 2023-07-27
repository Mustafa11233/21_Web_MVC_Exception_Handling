package in.ashokit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	//private Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@GetMapping("/msg")
	public String getGreetMessage(Model model) {
		String msg1 = "Welcome to Ashok IT..";
		
		
		model.addAttribute("msg",msg1);
		return "index";
	}
	
	@GetMapping("/welcome")
	public String getWelcomeMsg(Model model) {
		String msg1 = "Good Evening...!!!";
		String s =null;
		s.length();
		
		model.addAttribute("msg",msg1);
		return "index";
	}
	/*
	 * This will work as Local Exception Handling
	@ExceptionHandler(value = Exception.class)
	public String handleAE(Exception e) {
		
		String msg = e.getMessage();	
		logger.error(msg);
		return "errorPage";
	}
	*/
}
