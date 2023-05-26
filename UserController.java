package com.online.voting.OVM.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.online.voting.OVM.Model.User;
import com.online.voting.OVM.Servise.UserServise;

@Controller
public class UserController {
	@Autowired
	UserServise userServise;

	@RequestMapping("get")
	public String page() {
		return "registared";
	}

	@PostMapping("show")
	public String data(User user) {
		userServise.saveData(user);
		return "login";
	}
}
