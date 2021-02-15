package com.PhoneBook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.PhoneBook.Command.Contect;
import com.PhoneBook.Service.ContectService;

@Controller
@RequestMapping("/save")
public class ContectSaveController {
	
	//inject the service class
	@Autowired
	private ContectService service;
	
	@GetMapping(value= {"/","/index"})
	public String loadForm(@ModelAttribute("c")Contect c) {
		c.setContect_Name("XXXX");
		c.setContect_Email("xxxx@xxx.xxx");
		c.setContect_PhnoNumber(789456156L);
		return "ContectInfo";
	}
	
	@PostMapping("/index")
	public String handleFormBtn(@ModelAttribute("c")Contect c,Model map) {
		//use service
		boolean save = service.isSave(c);
		String msg="Contect Saved.....";
		map.addAttribute("msg", msg);
		c=new Contect();
		map.addAttribute("c", c);
		return "ContectInfo";
	}
}
