package com.marcos.medium.p0007_reverseinteger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @DisplayName("Reverse Integer - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("reverseIntegerTestCases")
    void shouldReverseIntegerCorrectly(String description, int x, int expected) {
        int result = solution.reverse(x);

        assertEquals(expected, result, description);
    }

    static Stream<Arguments> reverseIntegerTestCases() {
        return Stream.of(
                Arguments.of("zero", 0, 0),
                Arguments.of("one digit", 1, 1),
                Arguments.of("two digit", 12, 21),
                Arguments.of("basic case", 123, 321),
                Arguments.of("negative case", -123, -321),
                Arguments.of("ending zero case", 120, 21),
                Arguments.of("max safe reverse", 1463847412, 2147483641),
                Arguments.of("min safe reverse", -1463847412, -2147483641),
                Arguments.of("overflow positive", 1534236469, 0),
                Arguments.of("max integer value", Integer.MAX_VALUE, 0),
                Arguments.of("min integer value", Integer.MIN_VALUE, 0)
        );
    }
}