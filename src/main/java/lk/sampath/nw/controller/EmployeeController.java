package lk.sampath.nw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/employee01")
	public void sayHi() {
		System.out.println("hi.......");
	}
}
