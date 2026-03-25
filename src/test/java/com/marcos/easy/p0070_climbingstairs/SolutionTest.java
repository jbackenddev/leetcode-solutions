package com.marcos.easy.p0070_climbingstairs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @DisplayName("Climbing Stairs - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("climbingStairsTestCases")
    void shouldCalculateNumberOfWaysToClimbStairs(String description, int n, int expected) {
        int result = solution.climbStairs(n);

        assertEquals(expected, result);
    }

    static Stream<Arguments> climbingStairsTestCases() {
        return Stream.of(
                Arguments.of("minimum input", 1, 1),
                Arguments.of("small input", 2, 2),
                Arguments.of("first non-trivial case", 3, 3),
                Arguments.of("n = 4", 4, 5),
                Arguments.of("n = 5", 5, 8),
                Arguments.of("larger input", 10, 89),
                Arguments.of("upper constraint", 45, 1836311903)
        );
    }
}