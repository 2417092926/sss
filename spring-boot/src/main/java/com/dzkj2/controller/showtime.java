package com.dzkj2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dzkj2.pojo.user;
@Controller
public class showtime {
	@RequestMapping("/user")
		public String query(Model model){
			user user1=new user("赵威", 21);
			user user2=new user("谭凯", 20);
			user user3=new user("月饼", 20);
			List<user> data=new ArrayList<user>();
			data.add(user1);
			data.add(user2);
			data.add(user3);
			model.addAttribute("data", data);
			model.addAttribute("a", "赵威");
			return "index";
		}
	@RequestMapping("/login")
public String login(user u) {
	String name=u.getName();
	int age=u.getAge();
	if(name.equals("赵威")&&age==21) {
		return "redirect:/user";
		
	} return "login";
}
	@RequestMapping("/show")
	public String show() {
		return "index";
	}
	@RequestMapping("/http")
	public String http() {
		return "http";
	}
}

