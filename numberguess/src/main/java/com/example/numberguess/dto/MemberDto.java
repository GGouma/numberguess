package com.example.numberguess.dto;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
	String member_id; 
	String member_name;
	String member_password;
	Timestamp rec_create_date;
	Timestamp rec_update_date;
	String logical_del_flg;
	
	Collection<? extends GrantedAuthority> authority;
	
	public Collection<? extends GrantedAuthority> getAuthority() {
		List<Auth> authList = new ArrayList<>();
		Auth auth = new Auth();
		auth.setAuthority("ROLE_USER");
		authList.add(auth);
		return authList;

	}
}
