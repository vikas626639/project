package com.PhoneBook.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.PhoneBook.Command.Contect;
import com.PhoneBook.Service.ContectService;

@Controller
public class ViewController {
	
	//inject the service class
	@Autowired
	private ContectService service;

	@RequestMapping("/viewContect")
	public String viewAll( Model map) {
		//use service
		List<Contect> allContect = service.getAllContect();
		map.addAttribute("contectlist", allContect);
		return "displayContectInfo";
	}
	
	@RequestMapping("/updateContect")
	public String updateContect(@RequestParam("cid")Integer id,Model map) {
		//use service 
		Contect editContectById = service.editContectById(id);
		map.addAttribute("c", editContectById);
		return "ContectInfo";
	}
	
	@RequestMapping("/deleteContect")
	public String deleteContect(@RequestParam("cid")Integer id) {
		//use service
		boolean isdelete = service.dltContectById(id);
		if(isdelete) {
			return "redirect:/viewContect";			
		}
		return null;
	}
}
