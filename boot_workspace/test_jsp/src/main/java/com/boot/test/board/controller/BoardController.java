package com.boot.test.board.controller;

import com.boot.test.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.boot.test.dto.Board;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/boards")
public class BoardController {
        
        @Autowired
        private final BoardService service;
        @GetMapping//같은 Get이 여러개일 경우 이걸로 구분
        public ModelAndView boardDetail(@RequestParam("bno") int boardNum, ModelAndView mav){
            Board board = service.read(boardNum);
            log.info("board detail" + board.toString());
            mav.addObject("board",board);
            mav.setViewName("board/boardDetail");
            return mav;
        }


        //게시글 등록 처리용 메소드
        @PostMapping
        public ModelAndView boardInsert(@Validated Board board, ModelAndView mav){//@Validated 유효성검사
            log.info("board insert" + board.toString());
            service.register(board);
            mav.setViewName("redirect:/");
            return mav;
        }

        @DeleteMapping("/{bno}")
        public ResponseEntity<Void> boardDelete(@PathVariable("bno") int boardNum){
            service.remove(boardNum);
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }

         @PutMapping("/{bno}")
        public ResponseEntity<Void> boardUpdate(@PathVariable("bno") int boardNum, @Validated @RequestBody Board board){
            log.info(board.toString());
            service.modify(board);
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }


}
