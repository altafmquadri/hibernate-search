package com.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.User;
import com.test.service.UserService;

@Controller
public class SearchController {

	@Autowired
	private UserService userService;

	@GetMapping("/search")
	public ModelAndView getUser() {
		return new ModelAndView("search");
	}

	@PostMapping("/search")
	public ModelAndView searchValid(@RequestParam("id") int id) {
		User user = userService.getUserById(id);
		if (user != null) {
			return new ModelAndView("edit").addObject("user", user);
		}
		return new ModelAndView("");
	}
	
	@GetMapping("/edit")
	public ModelAndView showUser(@RequestParam("id") int id, @RequestParam("name") String name) {
		System.out.println("I am in the get edit method");
		User user = userService.getUserById(id);
		return new ModelAndView("edit").addObject("user", user);
	}
	
	
	
	@PostMapping("/edit")
	public ModelAndView saveUser(@RequestParam("id") int id, @RequestParam("name") String name) {
		User user = userService.getUserById(id);
		user.setName(name);
		userService.updateUser(user);
		return new ModelAndView("view").addObject("user", user);
	}
}
