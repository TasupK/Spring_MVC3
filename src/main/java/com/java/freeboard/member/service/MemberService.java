package com.java.freeboard.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.freeboard.mapper.MemberSQLMapper;
import com.java.freeboard.vo.MemberVO;

@Service
public class MemberService {
	
	
	@Autowired
	MemberSQLMapper memberMapper;

	public String selectNow () {
		return memberMapper.selectNow();
	}
	
	public MemberVO getMemberByIdAndPw(MemberVO memberVO) {
		return memberMapper.getMemberByIdAndPw(memberVO);
	}
	
	public void insertMember(MemberVO memberVO) {
		memberMapper.insertMember(memberVO);
	}
}
