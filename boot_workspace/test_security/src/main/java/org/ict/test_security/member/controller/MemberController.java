package org.ict.test_security.member.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ict.test_security.member.model.dto.MemberDto;
import org.ict.test_security.member.model.service.MemberService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
@CrossOrigin  //리액트 애플리케이션(포트가 다름)의 자원 요청을 처리하기 위함
public class MemberController {
    private final MemberService memberService;
    
    @GetMapping("/list")
    public ResponseEntity<ArrayList<MemberDto>> selectList(@RequestParam(name="page") int page, @RequestParam(name="limit") int limit) {
        Pageable pageable = PageRequest.of(page - 1, limit, Sort.by(Sort.Direction.DESC, "enrollDate"));
        return new ResponseEntity<>(memberService.selectList(pageable), HttpStatus.OK);
    }

    @GetMapping("/mdetail/{userId}")
    public ResponseEntity<MemberDto> selectDetail(@PathVariable("userId") String userId) {
        return new ResponseEntity<>(memberService.selectMember(userId),HttpStatus.OK);
    }
    
    //검색
    @GetMapping("/id")
     public ResponseEntity<ArrayList<MemberDto>> selectList(@RequestParam(name="page") int page, @RequestParam(name="limit") int limit,@RequestParam("keyword") String keyword) {
        Pageable pageable = PageRequest.of(page-1, limit, Sort.by(Sort.Direction.DESC, "enrollDate"));
        return new ResponseEntity<>(memberService.selectSearchUserid(keyword,pageable), HttpStatus.OK);
    }
    

    @PutMapping("/{userId}")
    public ResponseEntity<Void> update(@PathVariable("userId") String userId, @RequestBody MemberDto memberDto) {
        MemberDto member = memberService.selectMember(userId);
        member.setUserName(memberDto.getUserName());
        member.setAge(memberDto.getAge());
        memberService.updateMember2(member);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> delete(@PathVariable("userId") String userId){
        memberService.deleteMember(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<MemberDto> insert(@RequestBody MemberDto memberDto) {
        memberDto.setEmail("defaultMail@naver.com");
        memberDto.setSignType("direct");
        memberDto.setAdminYN("N");
        memberDto.setLoginOK("Y");
        memberDto.setEnrollDate(new Date());
        memberService.insertMember(memberDto);
        return new ResponseEntity<>(memberDto,HttpStatus.OK);
    }
    






}
