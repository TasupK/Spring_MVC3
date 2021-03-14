package com.java.freeboard.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.java.freeboard.vo.MemberVO;

@Mapper
public interface MemberSQLMapper {
	String selectNow();
	//로그인 메소드
	public MemberVO getMemberByIdAndPw(MemberVO memberVO);
	public void insertMember(MemberVO memberVO);
}
