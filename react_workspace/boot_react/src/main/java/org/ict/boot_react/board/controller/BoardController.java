package org.ict.boot_react.board.controller;


import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ict.boot_react.board.jpa.entity.BoardEntity;
import org.ict.boot_react.board.jpa.repository.BoardNativeVo;
import org.ict.boot_react.board.model.dto.BoardDto;
import org.ict.boot_react.board.model.service.BoardService;
import org.ict.boot_react.board.model.service.ReplyService;
import org.ict.boot_react.common.FileNameChange;
import org.ict.boot_react.common.PagingUtil;
import org.ict.boot_react.member.model.dto.MemberDto;
import org.ict.boot_react.member.model.service.MemberService;
import org.ict.boot_react.security.jwt.util.JWTUtil;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/boards")
@RequiredArgsConstructor
@CrossOrigin    //리액트 애플리케이션(포트가 다름)의 자원 요청을 처리하기 위함
public class BoardController {
    private final BoardService boardService;
    private final ReplyService replyService;


    //로그인 확인을 위해
    private final JWTUtil jwtUtil;
    private final MemberService memberService;

    @GetMapping("btop3")
    public ResponseEntity<List<BoardDto>> selectTop3() {
        log.info("/boards/btop3 => selectTop3()");
        ArrayList<BoardDto> boardList = boardService.selectTop3();
        return new ResponseEntity<>(boardList, HttpStatus.OK);
    }

    /*@GetMapping("/list")
    public ResponseEntity<List<BoardDto>> selectList(@RequestParam(name="page", required = false) int page, @RequestParam(name="limit",  required = false) int limit){
        log.info("/boards/list :  "+ page + "," + limit);
        //JPA가 제공하는 Pageable 객체를 사용함
        Pageable pageable = PageRequest.of(page - 1,limit, Sort.by(Sort.Direction.DESC, "boardNum"));
        //페이지에 출력할 목록 조회해옴  => 응답 처리
        return new ResponseEntity<>(boardService.selectList(pageable), HttpStatus.OK);
    }*/
    @GetMapping("/list")
    public ResponseEntity<Map> getAllBoards(@RequestParam(value = "p_num", required = false)
                                            int pnum) {
        Pageable pageable = PageRequest.of(pnum - 1,10, Sort.by(Sort.Direction.DESC, "boardNum"));
        //페이지에 출력할 목록 조회해옴  => 응답 처리
        return boardService.selectList(pageable, pnum);
    }


    @GetMapping("/title")
    public ResponseEntity<List<BoardDto>> selectSearchTitle(@RequestParam(name = "page") int page, @RequestParam(name = "limit") int limit, @RequestParam(name = "keyword") String keyword) {
        log.info("/boards/list :  " + page + "," + limit);
        //JPA가 제공하는 Pageable 객체를 사용함
        Pageable pageable = PageRequest.of(page - 1, limit, Sort.by(Sort.Direction.DESC, "boardNum"));
        //페이지에 출력할 목록 조회해옴  => 응답 처리
        return new ResponseEntity<>(boardService.selectSearchTitle(keyword, pageable), HttpStatus.OK);
    }

    @GetMapping("/writer")
    public ResponseEntity<List<BoardDto>> selectSearchWriter(@RequestParam(name = "page") int page, @RequestParam(name = "limit") int limit, @RequestParam(name = "keyword") String keyword) {
        log.info("/boards/list :  " + page + "," + limit);
        //JPA가 제공하는 Pageable 객체를 사용함
        Pageable pageable = PageRequest.of(page - 1, limit, Sort.by(Sort.Direction.DESC, "boardNum"));
        //페이지에 출력할 목록 조회해옴  => 응답 처리
        return new ResponseEntity<>(boardService.selectSearchWriter(keyword, pageable), HttpStatus.OK);
    }

    @GetMapping("/date")
    public ResponseEntity<List<BoardDto>> selectSearchDate(@RequestParam(name = "page") int page, @RequestParam(name = "limit") int limit, @RequestParam(name = "begin") java.sql.Date begin, @RequestParam(name = "end") java.sql.Date end) {
        log.info("/boards/list :  " + page + "," + limit);
        //JPA가 제공하는 Pageable 객체를 사용함
        Pageable pageable = PageRequest.of(page - 1, limit, Sort.by(Sort.Direction.DESC, "boardNum"));
        //페이지에 출력할 목록 조회해옴  => 응답 처리
        return new ResponseEntity<>(boardService.selectSearchDate(pageable, begin, end), HttpStatus.OK);
    }

    //목록 갯수 조회용
    @GetMapping("/countBoards")
    public ResponseEntity<Long> getCountBoards() {
        return new ResponseEntity<Long>(boardService.getCountBoards(), HttpStatus.OK);
    }

    //제목 검색 목록 갯수 조회용
    @GetMapping("/countSearchTitle")
    public ResponseEntity<Long> getCountSearchTitle(@RequestParam(name = "keyword") String keyword) {
        return new ResponseEntity<Long>(boardService.getCountSearchTitle(keyword), HttpStatus.OK);
    }

    //작성자 검색 목록 갯수 조회용
    @GetMapping("/countBoardsWriter")
    public ResponseEntity<Long> getCountSearchWriter(@RequestParam(name = "keyword") String keyword) {
        return new ResponseEntity<Long>(boardService.getCountSearchWriter(keyword), HttpStatus.OK);
    }

    //날짜 검색 목록 갯수 조회용
    @GetMapping("/countBoardsDate")
    public ResponseEntity<Long> getCountSearchDate(@RequestParam(name = "begin") java.sql.Date begin, @RequestParam(name = "end") java.sql.Date end) {
        return new ResponseEntity<>(boardService.getCountSearchDate(begin, end), HttpStatus.OK);
    }

    @GetMapping("/{boardNum}")
    public ResponseEntity<BoardDto> selectOne(@PathVariable(name = "boardNum") int boardNum) {
        BoardDto board = boardService.selectBoard(boardNum);
        log.info(board.toString());
        return new ResponseEntity<>(board, HttpStatus.OK);
    }

    @PostMapping    //HTTP POST 요청을 "/boards"로 매핑함
    public ResponseEntity<?> insertBoard(HttpServletRequest request, @RequestBody BoardDto board,
                                         @RequestParam("upfiles") MultipartFile multipartFile) throws IOException {
        //게시글 등록 요청 처리용 메서드임
        //로그인한 회원만 게시글 등록할 수 있음
        log.info(board.toString());
        
        //로그인한 회원이 요청한 것인지 확인 처리함
        String token = request.getHeader("Authorization").substring("Bearer".length());  //substring(7)
        String userId = jwtUtil.getUserIdFromToken(token);  //토큰에서 사용자 아이디 추출함
        //참고 : 공지사항인 경우 Role이 ADMIN인 확인도 필요할 것임
        //String adminYN = jwtUtil.getAdminFromToken(token);    //토큰에서 관리자 여부 추출함
        //if(adminYN.equals("N")){
        //    return ResponseEntity.status(HttpStatus.FORBIDDEN).body("관리자만 사용할 수 있는 서비스 입니다.");
        //}

        //아이디로 회원 정보를 조회함
        MemberDto loginMember = memberService.selectMember(userId);
        if(loginMember == null) {   //조회된 사용자 정보가 없다면 에러를 반환함
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("회원정보가 존재하지 않습니다.");
        }

        //업로드된 첨부파일이 있다면 저장 및 등록 처리
        if(! multipartFile.isEmpty()){
            //저장 폴더 경로 만들기
            String savePath = request.getServletContext().getRealPath("/board_upfiles");
            //업로드된 파일 이름 추출
            String fileName = multipartFile.getOriginalFilename();
            //폴더에 저장시 사용할 변경된 파일이름 만들기
            String renameFileName = FileNameChange.change(fileName, "yyyyMMddHHmmdd");
            //java.io.File 로 파일객체 만들기
            File saveFile = new File(savePath+"\\"+ renameFileName);
            //저장폴더에 바뀐 이름으로 저장 처리함
            multipartFile.transferTo(saveFile);

            board.setBoardOriginalFilename(fileName);
            board.setBoardRenameFilename(renameFileName);
        }

        board.setBoardWriter(loginMember.getUserId());

        //정상 로그인 상태이면, 글 등록 처리함
        boardService.insertBoard(board);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    //파일 다운로드 처리
    @GetMapping("/fdown")
    public ResponseEntity<InputStreamResource> fileDownload(@RequestParam("ofile") String originalFilename,
            @RequestParam("rfile") String renameFilename
            ,HttpServletRequest request) throws IOException {
        log.info("fileDownload : " + originalFilename + ", " + renameFilename);
        //저장 경로 지정
        String savePath = request.getServletContext().getRealPath("/board_upfiles");
        //읽을 파일에 대한 File객체 만들기
        File readFile = new File(savePath+"\\"+ renameFilename);
        //파일읽기 스트림 준비
        FileInputStream fileInputStream = new FileInputStream(readFile);
        InputStreamResource resource = new InputStreamResource(fileInputStream);

        //파일의 미디어 타입 얻기
        ServletContext servletContext = request.getServletContext();
        String mimeType = servletContext.getMimeType(originalFilename);
        MediaType mediaType = MediaType.parseMediaType(mimeType);


        //ResponseEntity : HTTP 응답 객체, HTTP 응답의 상태 코드, 헤더, 본문 등 등록 설정
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + originalFilename)
                .contentType(mediaType)
                .contentLength(readFile.length())
                .body(resource);

    }

    @PutMapping
    public void updateBoard(@RequestBody BoardDto board) {
        log.info(board.toString());
        boardService.updateBoard(board);
    }

    @DeleteMapping("/{boardNum}")
    public ResponseEntity<Void> deleteBoard(@PathVariable int boardNum) {
        boardService.deleteBoard(boardNum);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
