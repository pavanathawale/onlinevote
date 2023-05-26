package com.online.voting.OVM.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.online.voting.OVM.Model.UserLogin;
import com.online.voting.OVM.Servise.LoginServise;

@Service
public class LoginController {
	@Autowired
	LoginServise loginServise;

	@RequestMapping("loged")
	public String log(UserLogin login) {
		loginServise.loginData(login);
		return "thanks";
	}
}
