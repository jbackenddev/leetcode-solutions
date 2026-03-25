package com.marcos.easy.p0028_findindexfirstocurrencestring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @DisplayName("strStr - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("strStrTestCases")
    void shouldReturnFirstOccurrenceIndex(String description, String haystack, String needle, int expected) {
        int result = solution.strStr(haystack, needle);

        assertEquals(expected, result);
    }

    static Stream<Arguments> strStrTestCases() {
        return Stream.of(
                Arguments.of("match at start", "sadbutsad", "sad", 0),
                Arguments.of("match in middle", "hello", "ll", 2),
                Arguments.of("no match", "leetcode", "leeto", -1),
                Arguments.of("full match", "abc", "abc", 0),
                Arguments.of("single char match", "a", "a", 0),
                Arguments.of("needle bigger than haystack", "a", "aa", -1),
                Arguments.of("repeated characters", "aaaaa", "bba", -1),
                Arguments.of("overlapping pattern", "aaaab", "aaab", 1)
        );
    }
}