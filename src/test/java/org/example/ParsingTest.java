package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ParsingTest {

    @DisplayName("문자형태를 숫자형태로 변환.")
    @Test
    void parsingTest() {

        ParsingNumber parsingNumber = new ParsingNumber();

        parsingNumber.parsing( "1238532");

        assertThat(parsingNumber.parsing("1238532")).isEqualTo(1238532);

    }

}
