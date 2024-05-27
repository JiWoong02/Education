package org.ict.testjpa2.board.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)  //JUnit4 에서는 ( 이전버전 ) @RunWith 임, JUnit5에서는 @ExtendWith
// 테스트코드 실행을 위해서 사용하는 어노테이션
@WebMvcTest(BoardController.class)//실제 구동할 클래스 이름을 적음
//여러개를 나열할 수도 있음 EX) controllers = {BoardController.class, ReplyController.class ....}
//@WebMvcTest     => 어느클래스도 지정을 안했을 시 @Controller, @RestController, RestControllerAdvice 등 컨트롤러 관련
//                                  Bean으로 등록된거 모두 로드 가능
//() 안에 작성된 클래스만 테스트를 진행함
class BoardControllerTest {
    @Autowired  //의존성 주입, 자동 new 처리
    private MockMvc mvc;  //사용자를 가장한 객체 Contoller API 테스트 용도인 객체임
    //perform() 메소드를 사용해서 컨트롤러의 동작을 확인함, andExpect(), andDo(), andReturn() 메소드들도 같이 사용할수 있음
    
    //리턴타입은 viod, 접근제한자는 public | default 상관 없음 : 이 클래스에서 테스트 구동하고 끝내기 때문임
    // 메소드명도 마음대로 이름 지어줌
    @Test   // 테스트용
    /*public*/ void test3(){
        System.out.println("testTop3 : test시작 ####################");
    }

    @Test   // 테스트용 메소드에 반드시 표기함
    /*public*/ void testList(){
        System.out.println("testList : test 시작 ####################");
    }
     


}