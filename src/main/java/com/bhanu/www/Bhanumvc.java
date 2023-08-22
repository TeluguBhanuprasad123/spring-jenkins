package com.bhanu.www;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bhanumvc {
	
	Logger logger =LoggerFactory.getLogger(Bhanumvc.class);

	@GetMapping("/Get")
	public String gethome() {
		logger.info("application starated");
		logger.info("application starated in jenkins");
<<<<<<< HEAD
		return "Hello Bhanu successfully build in jenkins iam";
=======
		  return "Hello its deploy succesfully  dfgrg";
>>>>>>> 7258d0b6b7ac67e9c884a98922eb28c18acaadd4

	}
}
