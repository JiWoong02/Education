package com.boot.test.board.service;

import com.boot.test.dto.Board;

public interface BoardService {
    void register(Board board); //등록
    void modify(Board board);   //수정
    void remove(int boardNum);   //삭제
    Board read(int boardNum);   //한 개 상세조회

}
