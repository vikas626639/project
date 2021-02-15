package com.PhoneBook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.PhoneBook.Command.Contect;
import com.PhoneBook.Service.ContectService;

@Controller
//@RequestMapping("/save")
public class ContectSaveController {
	
	//inject the service class
	@Autowired
	private ContectService service;
	
	@GetMapping(value= {"/","/index"})
	public String loadForm(@ModelAttribute("c")Contect c) {
		return "ContectInfo";
	}
	
	@PostMapping("/index")
	public String handleFormBtn(@ModelAttribute("c")Contect c,Model map) {
		//use service
		 boolean id = service.isSave(c);
		String msg="Contect Saved.....";
		map.addAttribute("msg", msg);
		c=new Contect();
		map.addAttribute("c", c);
		return "ContectInfo";
	}
}
