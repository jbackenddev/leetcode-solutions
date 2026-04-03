package com.marcos.easy.p0283_movezeroes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @DisplayName("Move Zeroes - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("shallMoveZeroesTestCases")
    void shouldMoveZeroesCorrectly(String description, int[] nums, int[] expected) {
        solution.moveZeroes(nums);

        assertArrayEquals(expected, nums);
    }

    static Stream<Arguments> shallMoveZeroesTestCases() {
        return Stream.of(
                Arguments.of("All zeroes", new int[] {0,0,0}, new int[] {0,0,0}),
                Arguments.of("No zeroes", new int[] {1,2,3}, new int[] {1,2,3}),
                Arguments.of("Single element", new int[] {1}, new int[] {1}),
                Arguments.of("Mixed values", new int[] {0,1,0,3,12}, new int[] {1,3,12,0,0}),
                Arguments.of("Zero at start", new int[] {0,1}, new int[] {1,0}),
                Arguments.of("All non-zero except last", new int[] {1,2,3,0}, new int[] {1,2,3,0}),
                Arguments.of("Multiple zeroes between values", new int[] {1,0,2,0,3}, new int[] {1,2,3,0,0}),
                Arguments.of("All zeroes except one", new int[] {0,0,1}, new int[] {1,0,0}),
                Arguments.of("Large input pattern", new int[] {4,0,5,0,0,3,0,1}, new int[] {4,5,3,1,0,0,0,0}),
                Arguments.of("Empty array", new int[] {}, new int[] {})
        );
    }
}