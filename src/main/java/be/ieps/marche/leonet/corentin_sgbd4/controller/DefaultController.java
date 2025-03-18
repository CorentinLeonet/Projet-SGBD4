package be.ieps.marche.leonet.corentin_sgbd4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

	@RequestMapping("/home")
	String getIndex() {
		return "index";
	}
	
}
