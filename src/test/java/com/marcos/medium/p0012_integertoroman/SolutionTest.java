package com.marcos.medium.p0012_integertoroman;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @DisplayName("Integer to Roman - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("integerToRomanTestCases")
    void shouldConvertFromIntegerToRomanCorrectly(String description, int num, String expected) {
        String result = solution.intToRoman(num);

        assertEquals(expected, result, description);
    }

    static Stream<Arguments> integerToRomanTestCases() {
        return Stream.of(
                Arguments.of("Minimum value", 1, "I"),
                Arguments.of("Simple repetition", 3, "III"),
                Arguments.of("Five", 5, "V"),
                Arguments.of("Eight", 8, "VIII"),

                Arguments.of("Subtractive notation - one digit", 4, "IV"),
                Arguments.of("Subtractive notation - one digit (9)", 9, "IX"),
                Arguments.of("Subtractive notation - tens", 40, "XL"),
                Arguments.of("Subtractive notation - tens (90)", 90, "XC"),
                Arguments.of("Subtractive notation - hundreds", 400, "CD"),
                Arguments.of("Subtractive notation - hundreds (900)", 900, "CM"),

                Arguments.of("Mixed number", 58, "LVIII"),
                Arguments.of("Classic LeetCode case", 1994, "MCMXCIV"),
                Arguments.of("Another mix", 2421, "MMCDXXI"),

                Arguments.of("Number with zero in tens", 101, "CI"),
                Arguments.of("Number with zero in hundreds", 1005, "MV"),

                Arguments.of("Maximum value", 3999, "MMMCMXCIX")
        );
    }
}