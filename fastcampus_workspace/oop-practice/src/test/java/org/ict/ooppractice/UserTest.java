package org.ict.ooppractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest() {
        //given
        User user = new User();

        //when
        user.initPassword(() -> "aabbccddee");

        //then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("요구사항에 부합하지 않아 패스워드가 초기화되지 않는다.")
    @Test
    void passwordTest2() {
        //given
        User user = new User();

        //when
        user.initPassword(() -> "aab");

        //then
        assertThat(user.getPassword()).isNull();
    }


}