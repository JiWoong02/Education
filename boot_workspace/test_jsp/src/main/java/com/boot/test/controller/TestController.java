package com.boot.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.boot.test.dto.Board;
import com.boot.test.service.TestService;

@RestController
public class TestController {
	//@RequestMapping("/")
	//@ResponseBody
	// 두 개를 합쳐놓은 restAPI 방식
	@Autowired
	private TestService testService;
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/test")
	public String welcome() {
		return "Welcome! Spring Boot Project with JSP";
	}
	
	@GetMapping("/")
	public ModelAndView home(ModelAndView mv) {
		//mv.addObject("name", "홍길동");
		
		  List<Board> list = testService.selectList();
		 
		  mv.addObject("list", list);
		mv.setViewName("home");
		return mv;
	}

	@GetMapping("/movepage")
	public ModelAndView movepage(ModelAndView mv) {
		mv.setViewName("board/boardWritePage");
		return mv;
	}
}