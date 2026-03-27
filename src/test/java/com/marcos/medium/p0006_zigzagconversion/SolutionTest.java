package com.marcos.medium.p0006_zigzagconversion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @DisplayName("Should return correct zigzag string")
    @ParameterizedTest(name = "{0}")
    @MethodSource("zigZagStringTestCases")
    void zigZagStringTestCases(String description, String s, int numRows, String  expected) {
        String result = solution.convert(s, numRows);

        assertEquals(expected, result, description);
    }

    static Stream<Arguments> zigZagStringTestCases() {
        return Stream.of(
                Arguments.of("basic case with 3 rows", "PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
                Arguments.of("basic case with 4 rows", "PAYPALISHIRING", 4, "PINALSIGYAHRPI"),
                Arguments.of("single character", "a", 1, "a"),
                Arguments.of("numRows = 1 with longer string", "ABCDE", 1, "ABCDE"),
                Arguments.of("numRows greater than string length", "ABC", 5, "ABC")
        );
    }
}