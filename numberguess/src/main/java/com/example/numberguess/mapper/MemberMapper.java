package com.example.numberguess.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.numberguess.dto.MemberDto;

@Mapper
public interface MemberMapper {
	public MemberDto selectMember(String member_id);
}
