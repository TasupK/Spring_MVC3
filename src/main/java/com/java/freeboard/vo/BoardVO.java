package com.java.freeboard.vo;

import java.util.Date;

public class BoardVO {
	
	private int board_no;
	private int member_no;
	private String board_title;
	private String board_content;
	private int board_count;
	private String reg_date;
	private String mod_id;
	private String mod_date;
	
	/////////////////////////////////


	public BoardVO() {
		super();
	}
	
	public BoardVO(int board_no, int member_no, String board_title, String board_content, int board_count,
			String reg_date, String mod_id, String mod_date) {
		super();
		this.board_no = board_no; 
		this.member_no = member_no; 
		this.board_title = board_title; 
		this.board_content = board_content; 
		this.board_count = board_count;
		this.reg_date = reg_date;
		this.mod_id = mod_id;
		this.mod_date = mod_date;
	}
	
	////////////////////////////////////
	
	
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public int getBoard_count() {
		return board_count;
	}
	public void setBoard_count(int board_count) {
		this.board_count = board_count;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getMod_id() {
		return mod_id;
	}
	public void setMod_id(String mod_id) {
		this.mod_id = mod_id;
	}
	public String getMod_date() {
		return mod_date;
	}
	public void setMod_date(String mod_date) {
		this.mod_date = mod_date;
	}
	

}
