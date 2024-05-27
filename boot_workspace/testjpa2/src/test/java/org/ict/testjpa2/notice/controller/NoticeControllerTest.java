package org.ict.testjpa2.notice.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.ict.testjpa2.notice.model.dto.NoticeDto;
import org.ict.testjpa2.notice.model.service.NoticeService;
import org.json.JSONObject;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@SpringBootTest     //통합 테스트 용도로 사용됨
@ExtendWith(SpringExtension.class)  // 테스트 실행을 지정함
@WebMvcTest(NoticeController.class) //() 안의 클래스만 테스트할 수 있음 // 컨트롤러 테스트할때만 쓰는것
class NoticeControllerTest {    //단위 테스트에 해당됨
    @Autowired  // 의존성 주입
    //@AutoConfigureMockMvc : Rest Api 테스트시 사용함, MockMvc 설정 로드해서 의존성 주입시 사용
    private MockMvc mvc;    // 컨트롤러의 동작 확인용 객체
    @MockBean
    private NoticeService noticeService;
    //@MockBean : 가짜 객체 생성하는 어노테이션임
    //@Import(QuerydslConfig.class)   // Configuration Component 클래스 의존성 설정시 사용함
    @Autowired
    private ObjectMapper objectMapper;
    @Test   // 테스트용 메서드 지정시 사용
    @DisplayName("/notices POST() 테스트")
    void test1() throws Exception {
        System.out.println("test notices POST() ===========================================");

        NoticeDto noticeDto = NoticeDto.builder()
                        .noticeContent("테스트로 확인 완료됨...")
                                .noticeTitle("Junit 테스트 등록")
                                        .noticeWriter("한지웅")
                                                .build();
        JSONObject job = new JSONObject();
        job.put("noticeTitle", noticeDto.getNoticeTitle());
        job.put("noticeContent", noticeDto.getNoticeContent());
        job.put("noticeWriter", noticeDto.getNoticeWriter());
        //.content(job.toString())
        //                        .contentType(MediaType.APPLICATION_JSON)
        mvc.perform(post("/notices")
                        .content(job.toString()).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNoContent())
                .andDo(print());
        
    }

    @Test   // 테스트용 메서드 지정시 사용
    void test2() throws Exception {
        System.out.println("test2");

        String noticeNo = "12";
        mvc.perform(get("/notices/ndetail/" + noticeNo))
                .andExpect(status().isOk())
                .andDo(print());

        verify(noticeService).selectNotice(12);
    }

    @Test   // 테스트용 메서드 지정시 사용
    void test3() {
        System.out.println("test3");
    }

    @BeforeEach     // 각 테스트용 메서드가 실행되기 전 작동할 내용 처리하는 메소드를 표시함
    void setUp() {
        //주로 테스트용 메소드에 적용할 설정 셋업
        System.out.println("BeforeEach");
    }

    @AfterEach      //각 테스트용 메소드가 실행되고 난 다음에 처리할 내용을 작동하는 메소드를 표시함
    void tearDown() {
        //테스트가 끝난 다음 설정 해제 처리
        System.out.println("AfterEach");
    }

    @BeforeAll      //모든 테스트가 시작되기 전에 작동하는 메소드임 (static 처리 필요)
    static void setUpBeforeClass() throws Exception {
        System.out.println("BeforeAll");
    }

    @AfterAll       // 모든 테스트가 끝난 다음에 작동함 (static 처리 필요)
    static void tearDownAfterClass() throws Exception {
        System.out.println("AfterAll");
    }





}