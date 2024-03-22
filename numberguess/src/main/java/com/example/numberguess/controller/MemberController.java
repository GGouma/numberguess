package com.example.numberguess.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MemberController {
	
	@GetMapping("/login")
	public String login() {
		return "login_form";
	}

}
