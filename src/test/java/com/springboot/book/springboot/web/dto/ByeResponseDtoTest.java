package com.springboot.book.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ByeResponseDtoTest {

    // 롬복기능 테스트 연습용
    @Test
    public void 롬복기능_테스트_연습() {
        // given
        String name = "test";

        // when
        ByeResponseDto byeResponseDto = new ByeResponseDto(name);
        // then
        assertThat(byeResponseDto.getName()).isEqualTo(name);
    }
}
