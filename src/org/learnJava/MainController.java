package org.learnJava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String display() {
		System.out.println("Hello");
		return "Home";
	}

}
