package in.ashokit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/wish")
	public String getWishMsg(Model model) {
		String msgTxt = "Good Evening..";
		int i =10/0;
		model.addAttribute("msg", msgTxt);
		return "index";
	}
	@ExceptionHandler(value = Exception.class)
	public String handleAE(Exception e) {
		
		String msg = e.getMessage();	
		logger.error(msg);
		return "errorPage";
	}

}
