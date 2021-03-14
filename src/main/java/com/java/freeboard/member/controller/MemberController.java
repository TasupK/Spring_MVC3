package com.java.freeboard.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.freeboard.member.service.MemberService;
import com.java.freeboard.vo.MemberVO;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login() {
		return "/member/login_page";
	}
	
	
	@RequestMapping(value = "/login_process.do", method = RequestMethod.GET)
	public String loginProcess(MemberVO memberVO, HttpSession session) {
		MemberVO userData = memberService.getMemberByIdAndPw(memberVO);
		if(userData == null) {
			return "/member/login_fail";
		}else {
			session.setAttribute("sessionUserData", userData);
			System.out.println("세션에 들어있는 값 : "+session.getAttribute("sessionUserData").toString());
			return "redirect:/board/main_page.do";
		}
	}
	
	@RequestMapping("/logout_process.do")
	public String logoutProcess(HttpSession session) {
		session.invalidate();
		return "redirect:/member/login.do";
	}
	
	@RequestMapping("/join_member_page.do")
	public String joinMember() {
		return "/member/join_member_page";
	}
	
	@RequestMapping("/join_member_process.do")
	public String joinMemberProcess(MemberVO memberVO) {
		memberService.insertMember(memberVO);
		return "redirect:/member/login.do";
	}
	

}
