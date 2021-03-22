package com.java.freeboard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.java.freeboard.vo.BoardVO;

@Mapper
public interface BoardSQLMapper {
	public List<BoardVO> selectBoard();
	public BoardVO getBoard(BoardVO boardVO);
	public void insertBoard(BoardVO boardVO);

}