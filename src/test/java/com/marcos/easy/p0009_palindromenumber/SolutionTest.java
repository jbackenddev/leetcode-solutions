package com.marcos.easy.p0009_palindromenumber;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @DisplayName("Palindrome Number - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("providePalindromeNumberTestCases")
    void shouldReturnWhetherNumberIsPalindrome(String description, int x, boolean expected) {
        boolean result = solution.isPalindrome(x);

        assertEquals(expected, result);
    }

    static Stream<Arguments> providePalindromeNumberTestCases() {
        return Stream.of(
                Arguments.of("negative number", -121, false),
                Arguments.of("non-palindrome ending with zero", 10, false),
                Arguments.of("single digit", 7, true),
                Arguments.of("zero", 0, true),
                Arguments.of("palindrome number with two digits", 11, true),
                Arguments.of("palindrome number with three digits", 121, true),
                Arguments.of("large palindrome", 123454321, true),
                Arguments.of("large non-palindrome", 123456789, false)
        );
    }
}