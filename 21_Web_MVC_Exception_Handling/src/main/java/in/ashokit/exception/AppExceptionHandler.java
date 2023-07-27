package in.ashokit.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
//it will work like a AOP Component
public class AppExceptionHandler {

	private Logger logger = LoggerFactory.getLogger(AppExceptionHandler.class);
	
	@ExceptionHandler(value = Exception.class)
	public String handleAE(Exception e) {
		
		String msg = e.getMessage();	
		logger.error(msg);
		return "errorPage";
	}
}
