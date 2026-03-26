package com.marcos.easy.p0013_romantointeger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @DisplayName("Roman to Integer - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("romanToIntTestCases")
    void shouldConvertRomanToInt(String description, String s, int expected) {
        int result = solution.romanToInt(s);

        assertEquals(expected, result);
    }

    static Stream<Arguments> romanToIntTestCases() {
        return Stream.of(
                // Basic
                Arguments.of("Single numeral", "I", 1),
                Arguments.of("Single large numeral", "M", 1000),

                // Additive
                Arguments.of("Repeated numerals", "III", 3),
                Arguments.of("Mixed additive", "LVIII", 58),

                // Subtractive (all types)
                Arguments.of("Subtractive IV", "IV", 4),
                Arguments.of("Subtractive IX", "IX", 9),
                Arguments.of("Subtractive XL", "XL", 40),
                Arguments.of("Subtractive XC", "XC", 90),
                Arguments.of("Subtractive CD", "CD", 400),
                Arguments.of("Subtractive CM", "CM", 900),

                // Mixed complex
                Arguments.of("Complex number", "MCMXCIV", 1994),
                Arguments.of("Another complex", "MMXXIII", 2023),
                Arguments.of("Mixed sequence", "XIV", 14),
                Arguments.of("Mixed sequence 2", "XXIV", 24)
        );
    }
}