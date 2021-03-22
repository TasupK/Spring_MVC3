package com.java.freeboard.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.freeboard.board.service.BoardService;
import com.java.freeboard.vo.BoardVO;

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
	
	
}
