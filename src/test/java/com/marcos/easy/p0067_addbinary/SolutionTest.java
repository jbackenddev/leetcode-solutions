package com.marcos.easy.p0067_addbinary;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @DisplayName("Add Binary - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("provideAddBinaryTestCases")
    void shouldReturnWhetherNumberIsPalindrome(String description, String a, String b, String expected) {
        String result = solution.addBinary(a, b);

        assertEquals(expected, result);
    }

    static Stream<Arguments> provideAddBinaryTestCases() {
        return Stream.of(
                Arguments.of("basic add binary", "11", "1", "100"),
                Arguments.of("bigger binary add", "1010", "1011", "10101")
        );
    }
}