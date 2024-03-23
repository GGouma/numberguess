package com.example.numberguess.dto;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Data
public class UserDetailsImpl implements UserDetails {
	
	
	private MemberDto memberdto;
	
	public UserDetailsImpl(MemberDto memberdto) {
		this.memberdto = memberdto;
	}
	
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return memberdto.getAuthority();
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return memberdto.getMember_password();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return memberdto.getMember_id();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
