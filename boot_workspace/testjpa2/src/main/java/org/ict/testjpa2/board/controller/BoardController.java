package org.ict.testjpa2.board.controller;


import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ict.testjpa2.board.jpa.entity.BoardEntity;
import org.ict.testjpa2.board.jpa.repository.BoardNativeVo;
import org.ict.testjpa2.board.model.dto.BoardDto;
import org.ict.testjpa2.board.model.service.BoardService;
import org.ict.testjpa2.board.model.service.ReplyService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/boards")
@RequiredArgsConstructor
@CrossOrigin    //리액트 애플리케이션(포트가 다름)의 자원 요청을 처리하기 위함
public class BoardController {
    private final BoardService boardService;
    private final ReplyService replyService;

    @GetMapping("btop3")
    public ResponseEntity<List<BoardDto>> selectTop3() {
        log.info("/boards/btop3 => selectTop3()");
        ArrayList<BoardDto> boardList = boardService.selectTop3();
        return new ResponseEntity<>(boardList, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<BoardDto>> selectList(@RequestParam(name="page") int page, @RequestParam(name="limit") int limit){
        log.info("/boards/list :  "+ page + "," + limit);
        //JPA가 제공하는 Pageable 객체를 사용함
        Pageable pageable = PageRequest.of(page - 1,limit, Sort.by(Sort.Direction.DESC, "boardNum"));
        //페이지에 출력할 목록 조회해옴  => 응답 처리
        return new ResponseEntity<>(boardService.selectList(pageable), HttpStatus.OK);
    }
    @GetMapping("/title")
    public ResponseEntity<List<BoardDto>> selectSearchTitle(@RequestParam(name="page") int page, @RequestParam(name="limit") int limit,@RequestParam(name="keyword") String keyword){
        log.info("/boards/list :  "+ page + "," + limit);
        //JPA가 제공하는 Pageable 객체를 사용함
        Pageable pageable = PageRequest.of(page - 1,limit, Sort.by(Sort.Direction.DESC, "boardNum"));
        //페이지에 출력할 목록 조회해옴  => 응답 처리
        return new ResponseEntity<>(boardService.selectSearchTitle(keyword,pageable), HttpStatus.OK);
    }
    @GetMapping("/writer")
    public ResponseEntity<List<BoardDto>> selectSearchWriter(@RequestParam(name="page") int page, @RequestParam(name="limit") int limit,@RequestParam(name="keyword") String keyword){
        log.info("/boards/list :  "+ page + "," + limit);
        //JPA가 제공하는 Pageable 객체를 사용함
        Pageable pageable = PageRequest.of(page - 1,limit, Sort.by(Sort.Direction.DESC, "boardNum"));
        //페이지에 출력할 목록 조회해옴  => 응답 처리
        return new ResponseEntity<>(boardService.selectSearchWriter(keyword,pageable), HttpStatus.OK);
    }
    @GetMapping("/date")
    public ResponseEntity<List<BoardDto>> selectSearchDate(@RequestParam(name="page") int page, @RequestParam(name="limit") int limit,@RequestParam(name="begin") java.sql.Date begin,@RequestParam(name="end") java.sql.Date  end){
        log.info("/boards/list :  "+ page + "," + limit);
        //JPA가 제공하는 Pageable 객체를 사용함
        Pageable pageable = PageRequest.of(page - 1,limit, Sort.by(Sort.Direction.DESC, "boardNum"));
        //페이지에 출력할 목록 조회해옴  => 응답 처리
        return new ResponseEntity<>(boardService.selectSearchDate(pageable, begin, end), HttpStatus.OK);
    }

    //목록 갯수 조회용
    @GetMapping("/countBoards")
    public ResponseEntity<Long> getCountBoards(){
        return new ResponseEntity<Long>(boardService.getCountBoards(), HttpStatus.OK);
    }
    //제목 검색 목록 갯수 조회용
    @GetMapping("/countSearchTitle")
    public ResponseEntity<Long> getCountSearchTitle(@RequestParam(name="keyword") String keyword){
        return new ResponseEntity<Long>(boardService.getCountSearchTitle(keyword), HttpStatus.OK);
    }
    //작성자 검색 목록 갯수 조회용
    @GetMapping("/countBoardsWriter")
    public ResponseEntity<Long> getCountSearchWriter(@RequestParam(name="keyword") String keyword){
        return new ResponseEntity<Long>(boardService.getCountSearchWriter(keyword), HttpStatus.OK);
    }
    //날짜 검색 목록 갯수 조회용
    @GetMapping("/countBoardsDate")
    public ResponseEntity<Long> getCountSearchDate(@RequestParam(name="begin") java.sql.Date begin,@RequestParam(name="end") java.sql.Date end){
        return new ResponseEntity<>(boardService.getCountSearchDate(begin,end), HttpStatus.OK);
    }
    
    
    
    
    
    
    
    

    @GetMapping("/{boardNum}")
    public ResponseEntity<BoardDto> selectOne(@PathVariable(name = "boardNum") int boardNum) {
        BoardDto board =boardService.selectBoard(boardNum);
        log.info(board.toString());
        return  new ResponseEntity<>(board, HttpStatus.OK);
    }

    @PostMapping
    public void insertBoard(@RequestBody BoardDto board){
        log.info(board.toString());
        boardService.insertBoard(board);
    }
    @PutMapping
    public void updateBoard(@RequestBody BoardDto board){
        log.info(board.toString());
        boardService.updateBoard(board);
    }
    @DeleteMapping("/{boardNum}")
    public void deleteBoard(@PathVariable int boardNum){
        boardService.deleteBoard(boardNum);
    }


}
