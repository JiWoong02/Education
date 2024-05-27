package org.ict.testjpa.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ict.testjpa.board.dto.Board;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import org.ict.testjpa.board.service.BoardService;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/boards")
public class BoardController {
    private final BoardService service;

    @GetMapping
    public ResponseEntity<List<Board>> selectAll(){
        log.info("selectAll()");
        return new ResponseEntity<>(service.selectList(), HttpStatus.OK);
    }

    @GetMapping("/{boardNum}")
    public ResponseEntity<Board> selectOne(@PathVariable(name = "boardNum") Long boardNum){
        log.info("selectOne()");
        Optional<Board> ob =service.selectBoard(boardNum);
        return new ResponseEntity<>(ob.get(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Board> insert(@RequestBody Board board){
        log.info("insert()");
        board.setBoardDate(new Date(Calendar.getInstance().getTimeInMillis()));
        service.insertBoard(board);
        return new ResponseEntity<>(board, HttpStatus.OK);
    }

    @PutMapping("/{boardNum}")  //요청 경로에 반드시 pk에 해당하는 값을 전송해야 함 ( 안 보내면 에러 )
    public ResponseEntity<Board> update(@RequestBody Board board){
        log.info("update()");
        board.setBoardDate(new Date(Calendar.getInstance().getTimeInMillis()));
        service.helloBoard(board);
        return new ResponseEntity<>(board, HttpStatus.OK);
    }

    @DeleteMapping("/{boardNum}")
    public ResponseEntity<Void> delete(@PathVariable("boardNum") Long boardNum){
        log.info("delete()");
        service.deleteBoard(boardNum);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}