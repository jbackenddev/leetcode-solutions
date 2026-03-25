package com.marcos.easy.p0003_longestsubstringwithoutrepeatingcharacter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @DisplayName("Longest Substring Without Repeating Characters - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("lengthOfLongestSubstringTestCases")
    void shouldFindLengthOfLongestSubstring(String description, String s, int expected) {
        int result = solution.lengthOfLongestSubstring(s);

        assertEquals(expected, result);
    }

    static Stream<Arguments> lengthOfLongestSubstringTestCases() {
        return Stream.of(
                Arguments.of("empty string", "", 0),
                Arguments.of("simple letter", "a", 1),
                Arguments.of("same characters", "aaaaa", 1),
                Arguments.of("different characters", "abcdef", 6),
                Arguments.of("substring at the beginning", "abcabcbb", 3),
                Arguments.of("substring in the middle", "pwwkew", 3),
                Arguments.of("adjacent duplicates", "abba", 2),
                Arguments.of("long substring at the end", "dvdf", 3),
                Arguments.of("restart window correctly", "tmmzuxt", 5),
                Arguments.of("string with space", " ", 1),
                Arguments.of("complex case", "anviaj", 5)
        );
    }
}