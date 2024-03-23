package com.example.numberguess.dto;

import org.springframework.security.core.GrantedAuthority;

public class Auth implements GrantedAuthority {

	private String auth;
	
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return auth;
	}
	
	public void setAuthority(String auth) {
		this.auth = auth;
	}

}
