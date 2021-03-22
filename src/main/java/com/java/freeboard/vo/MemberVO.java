package com.java.freeboard.vo;

import java.util.Date;

public class MemberVO {
	/*
	 * VO에는 전체 개발에 사용할 VO를 패키지 하나에 모아둘 예정입니다.
	 * 태섭씨 BoardVO 저희 만들던거 만드셔야 겠죠? 
	 * 기억이 안나면 전화 ㄱㄱ 
	 * 
	 * 
	 */
	private int member_no;
	private String member_id;
	private String member_pw;
	private String member_name;
	private String member_gender;
	private Date reg_date;
	
	
	/////////////////////////
	
	
	public MemberVO() {
		super();
	}

	
	public MemberVO(int member_no, String member_id, String member_pw, String member_name, String member_gender,
			Date reg_date) {
		super();
		this.member_no = member_no;
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_name = member_name;
		this.member_gender = member_gender;
		this.reg_date = reg_date;
	}
	

	/////////////////////////
	
	
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_gender() {
		return member_gender;
	}
	public void setMember_gender(String member_gender) {
		this.member_gender = member_gender;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
}
