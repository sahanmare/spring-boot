package lk.sampath.nw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		
		System.out.println("Goes Here..........");
		
		return "index";
	}
}
