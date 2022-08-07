package lk.sampath.nw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lk.sampath.nw.model.Branch;
import lk.sampath.nw.service.BranchService;

@Controller
public class BranchController {

	@Autowired
	private BranchService service;
	
	@RequestMapping("/branch")
	public String viewHomePage(Model model) {
		
		List<Branch> listBranch = service.listAll();
		
//		for (Branch branch : listBranch) {
//			System.out.println(branch.getName());
//		};
//		
//		listBranch.forEach(lstitem->System.out.println(lstitem));
		
		model.addAttribute("listBranch", listBranch);
		
		return "branch/branch";
	}
}
