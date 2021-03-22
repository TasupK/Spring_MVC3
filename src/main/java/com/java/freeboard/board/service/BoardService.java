package com.java.freeboard.board.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.freeboard.mapper.BoardSQLMapper;
import com.java.freeboard.vo.BoardVO;


@Service
public class BoardService {

	@Autowired
	BoardSQLMapper boardmapper;
	
	public 	List<Map<String,Object>> selectBoard() {
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		List<BoardVO> boardList = boardmapper.selectBoard();
		for (BoardVO boardVo : boardList) {
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("boardVo", boardVo);
			 for( Entry<String, Object> elem : map.entrySet() ){
		            System.out.println( String.format("키 : %s, 값 : %s", elem.getKey(), elem.getValue()) );
			 }
		}
		return list;
	
	}
	
	public BoardVO getBoard(BoardVO boardVO) {
		return boardmapper.getBoard(boardVO);
	}
	
	public void insertBoard(BoardVO boardVO) {
		boardmapper.insertBoard(boardVO);
	}
	
}
