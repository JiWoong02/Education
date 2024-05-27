package org.ict.boot_react.security.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithAnonymousUser;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
class LoginControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    @WithMockUser(username = "user01", roles = "USER") //아무나 요청했을 때
    public void index_anonymous() throws Exception {
        mockMvc.perform(get("/api/auth/login"))   // 1. mockMvc 를 통해, post메소드를 실행
                .andDo(print()) //3. 결과를 프린트해라
                .andExpect(status().isOk());    // 2. status 코드 값이 ok가 되었을 때
    }
}