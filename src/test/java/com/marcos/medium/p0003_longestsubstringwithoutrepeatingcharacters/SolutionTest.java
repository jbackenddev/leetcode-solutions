package com.marcos.medium.p0003_longestsubstringwithoutrepeatingcharacters;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @DisplayName("Should return correct length of longest substring without repeating characters")
    @ParameterizedTest(name = "{0}")
    @MethodSource("longestSubstringTestCases")
    void shouldReturnLengthOfLongestSubstring(String description, String s, int expected) {
        int result = solution.lengthOfLongestSubstring(s);

        assertEquals(expected, result, description);
    }

    static Stream<Arguments> longestSubstringTestCases() {
        return Stream.of(
                Arguments.of("basic case", "abcabcbb", 3),
                Arguments.of("same character case", "bbbbb", 1),
                Arguments.of("longest in the middle case", "pwwkew", 3),

                // edge cases
                Arguments.of("empty string", "", 0),
                Arguments.of("single character", "a", 1),
                Arguments.of("two different chars", "ab", 2),
                Arguments.of("duplicate at the end", "abcddef", 4),
                Arguments.of("duplicate at the start", "aabcd", 4),
                Arguments.of("complex case", "dvdf", 3),
                Arguments.of("all unique", "abcdefg", 7)
        );
    }
}