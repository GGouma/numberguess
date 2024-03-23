package com.example.numberguess.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.numberguess.mapper.MemberMapper;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private MemberMapper memberMapper;   
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		log.info("들어옴");
		MemberDto memberdto = memberMapper.selectMember(username);
		if(memberdto != null) {
			log.info("if들어옴");
			return new UserDetailsImpl(memberdto);
		}
		return null;
	}

}
