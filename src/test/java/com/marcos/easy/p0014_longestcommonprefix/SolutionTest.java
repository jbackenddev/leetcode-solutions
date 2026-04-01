package com.marcos.easy.p0014_longestcommonprefix;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @DisplayName("Longest Common Prefix - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("longestCommonPrefixTestCases")
    void shouldFindLongestCommonPrefix(String description, String[] strs, String expected) {
        String result = solution.longestCommonPrefix(strs);

        assertEquals(expected, result);
    }

    static Stream<Arguments> longestCommonPrefixTestCases() {
        return Stream.of(
                // Basic
                Arguments.of("Empty array", new String[] {}, ""),
                Arguments.of("Single string in array", new String[] {"string"}, "string"),

                // Prefix behavior
                Arguments.of("Common prefix exists", new String[] {"flower", "flow", "flight"}, "fl"),
                Arguments.of("No common prefix", new String[] {"dog", "cat", "cathedral"}, ""),
                Arguments.of("All strings identical", new String[] {"dog", "dog", "dog"}, "dog"),

                // Edge cases
                Arguments.of("Array with empty string", new String[] {"", "b", "c"}, ""),
                Arguments.of("Single character strings", new String[] {"a", "a", "a"}, "a"),
                Arguments.of("Single character mismatch", new String[] {"a", "b"}, ""),
                Arguments.of("Shortest string is the prefix", new String[] {"ab", "abc", "abcd"}, "ab"),
                Arguments.of("Prefix becomes empty during comparison", new String[] {"abc", "def", "ghi"}, "")
        );
    }
}