package com.java.freeboard.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@RequestMapping("/main_page.do")
	public String mainPage() {
		return "board/main_page";
	}
}
