package com.java.freeboard.board.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.freeboard.board.service.BoardService;
import com.java.freeboard.vo.BoardVO;
import com.java.freeboard.vo.MemberVO;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	public BoardService boardService;
	

	
	//출력
	@RequestMapping(value = "/main_page.do", method = RequestMethod.GET)
	public String main_page(Model model) {
		List<Map<String, Object>> boardList = boardService.selectBoard();
		model.addAttribute("boardList",boardList);
		return "/board/main_page";
	}
	
	@RequestMapping(value = "/write_content_page.do")
	public String write_content_page() {
		return "/board/write_content_page";
	}
	
	@RequestMapping(value = "/write_content_process.do")
	public String write_content_process(BoardVO boardVO, HttpSession session) {
		MemberVO memberVO = new MemberVO();
		MemberVO userData = (MemberVO)session.getAttribute("sessionUserData");
		int member_no = userData.getMember_no();
		boardVO.setMember_no(member_no);
		boardService.insertBoard(boardVO);
		return "redirect:/board/main_page.do";
	}
	
	@RequestMapping(value = "/read_content_page.do")
	public String read_content_page(Model model, int board_no) {
		Map<String,Object> boardMap = boardService.getBoard(board_no);
		model.addAttribute("boardMap", boardMap);
		return "/board/read_content_page";
	}
	
	@RequestMapping(value = "/delete_content_process.do")
	public String delete_content_process(BoardVO boardVO) {
		boardService.deleteBoard(boardVO);
		return "redirect:/board/main_page.do";
	}
	
	@RequestMapping(value = "/update_content_page.do")
	public String update_content_page(Model model, int board_no) {
		Map<String,Object> boardMap = boardService.getBoard(board_no);
		model.addAttribute("boardMap", boardMap);
		return "/board/update_content_page";
	}
	
	@RequestMapping(value = "/update_content_process.do")
	public String update_content_process(BoardVO boardVO) {
		boardService.updateBoard(boardVO);
		return "redirect:/board/main_page.do";
	}
}
