package org.ict.boot_react.board.model.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ict.boot_react.board.jpa.entity.BoardEntity;
import org.ict.boot_react.board.jpa.repository.BoardNativeVo;
import org.ict.boot_react.board.jpa.repository.BoardRepository;
import org.ict.boot_react.board.model.dto.BoardDto;
import org.ict.boot_react.common.PagingUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.*;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class BoardService {
    //Service 에 대한 interface 를 만들어서, 상속받은 SericeImpl 클래스를 만드는 구조로 작성해도 됨

    private final BoardRepository boardRepository;
    private Logger logger = LoggerFactory.getLogger(BoardService.class);
    public ArrayList<BoardDto> selectTop3() {
        List<BoardNativeVo> nativeList = boardRepository.findTop3();
        ArrayList<BoardDto> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            BoardDto boardDto = new BoardDto();
            boardDto.setBoardNum(nativeList.get(i).getBoard_num());
            boardDto.setBoardTitle(nativeList.get(i).getBoard_title());
            boardDto.setBoardReadcount(nativeList.get(i).getBoard_readcount());
            list.add(boardDto);
        }
        //내림차순정렬된 상위 3개만 추출함
        //JPQL 은 WHERE, GROUP BY 절에서만 서브쿼리 사용 가능함 => FROM 절에서 서브쿼리 사용 못 함
        return list;

    }

    public ResponseEntity<Map> selectList(Pageable pageable,Integer p_num) {
        Page<BoardEntity> pages = boardRepository.findAll(pageable);
        Map result = null;
        ArrayList<BoardDto> list = new ArrayList<BoardDto>();
        for (BoardEntity boardEntity : pages) {
            list.add(boardEntity.toDto());
        }
        //프론트에 넘길 데이터 만들기
        PagingUtil pu = new PagingUtil(p_num, 10, 10);
        pu.setObjectCountTotal(selectListCount());
        pu.setCalcForPaging();
        result = new HashMap<>();
        result.put("pagingData", pu);
        logger.info("currentPageNum : "+pu.getCurrentPageNum());
        logger.info("pageNumCountPerPage : "+pu.getPageNumCountPerPage());
        result.put("list", list);
        return ResponseEntity.ok(result);
    }

    public int selectListCount() {
        return boardRepository.findAll().size();
    }

    public BoardDto selectBoard(int boardNum) {
        BoardEntity boardEntity = boardRepository.findById(boardNum).get();
        boardEntity.setBoardReadcount(boardEntity.getBoardReadcount() + 1);
        return boardEntity.toDto();
    }

    public void insertBoard(BoardDto boardDto) {
        boardRepository.save(boardDto.toEntity());
    }

    public void updateBoard(BoardDto boardDto) {
        BoardEntity boardEntity = boardRepository.findById(boardDto.getBoardNum()).get();
        boardEntity.setBoardTitle(boardDto.getBoardTitle());
        boardEntity.setBoardContent(boardDto.getBoardContent());
        boardEntity.setBoardReadcount(boardDto.getBoardReadcount() + 1);
    }

    public void deleteBoard(int boardNum) {
        boardRepository.deleteById(boardNum);
    }

    public List<BoardDto> selectSearchTitle(String keyword, Pageable pageable) {
        Page<BoardEntity> pages = boardRepository.findSearchTitle(keyword, pageable);
        ArrayList<BoardDto> list = new ArrayList<BoardDto>();
        for (BoardEntity boardEntity : pages) {
            list.add(boardEntity.toDto());
        }
        return list;
    }

    public List<BoardDto> selectSearchWriter(String keyword, Pageable pageable) {
        Page<BoardEntity> pages = boardRepository.findSearchWriter(keyword, pageable);
        ArrayList<BoardDto> list = new ArrayList<BoardDto>();
        for (BoardEntity boardEntity : pages) {
            list.add(boardEntity.toDto());
        }
        return list;
    }

    public List<BoardDto> selectSearchDate(Pageable pageable, Date begin, Date end) {
        Page<BoardEntity> pages = boardRepository.findSearchDate(begin, end, pageable);
        ArrayList<BoardDto> list = new ArrayList<BoardDto>();
        for (BoardEntity boardEntity : pages) {
            list.add(boardEntity.toDto());
        }
        return list;
    }

    //board 테이블 총 목록 갯수 리턴
    public long getCountBoards() {
        return boardRepository.count();
    }

    //제목 검색에 대한 목록 갯수
    public long getCountSearchTitle(String keyword) {
        return boardRepository.countSearchTitle(keyword);
    }

    //작성자 검색에 대한 목록 갯수
    public long getCountSearchWriter(String keyword) {
        return boardRepository.countSearchWriter(keyword);
    }

    //등록날짜 검색에 대한 목록 갯수
    public long getCountSearchDate(java.sql.Date begin, java.sql.Date end) {
        return boardRepository.countSearchTitle(begin, end);
    }

}