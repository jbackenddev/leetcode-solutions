package com.marcos.easy.p0392_issubsequence;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @DisplayName("Is Subsequence - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("testIfIsSubSequenceTestCases")
    void shouldCheckIfIsSubsequenceCorrectly(String description, String s, String t, boolean expected) {
        boolean result = solution.isSubsequence(s, t);

        assertEquals(expected, result);
    }

    static Stream<Arguments> testIfIsSubSequenceTestCases() {
        return Stream.of(
                Arguments.of("Both empty", "", "", true),
                Arguments.of("Empty S", "", "abc", true),
                Arguments.of("Empty T", "abc", "", false),

                Arguments.of("Not a subsequence", "123", "abc", false),
                Arguments.of("Almost but not a subsequence", "abc", "abb", false),

                Arguments.of("S equals T", "abc", "abc", true),
                Arguments.of("Basic subsequence", "abc", "abcd", true),
                Arguments.of("Complex subsequence", "abc", "a12b0b34c54d", true),

                Arguments.of("S longer than T", "abc", "a", false)
        );
    }
}