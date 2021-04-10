package com.java.freeboard.board.service;

import java.text.DateFormat.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.freeboard.mapper.BoardSQLMapper;
import com.java.freeboard.mapper.MemberSQLMapper;
import com.java.freeboard.vo.BoardVO;
import com.java.freeboard.vo.MemberVO;


@Service
public class BoardService {

	@Autowired
	private BoardSQLMapper boardmapper;
	@Autowired
	private MemberSQLMapper membermapper;
	
	public List<Map<String,Object>> selectBoard(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		List<BoardVO> boardList = boardmapper.selectBoard();
		for (BoardVO boardVo : boardList) {
			MemberVO memberVo = membermapper.selectByNo(boardVo.getMember_no());
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("boardVo", boardVo);
			map.put("memberVo", memberVo);
			list.add(map);
			
		}

		return list;
	
	}
	
	public Map<String,Object> getBoard(int board_no) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		BoardVO boardVo = boardmapper.getBoard(board_no);
		MemberVO memberVo = membermapper.selectByNo(boardVo.getMember_no());
		map.put("memberVo", memberVo);
		map.put("boardVo", boardVo);
		
		return map;
	}
	
	public void insertBoard(BoardVO boardVO) {
		boardmapper.insertBoard(boardVO);	
	}
	
	public void deleteBoard(BoardVO boardVO) {
		boardmapper.deleteBoard(boardVO);
	}
	
	public void updateBoard(BoardVO boardVO) {
		boardmapper.updateBoard(boardVO);
	}
}
