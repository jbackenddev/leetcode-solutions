package com.marcos.easy.p0136_singlenumber;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @DisplayName("Single Number - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("singleNumberTestCases")
    void shouldFindSingleNumber(String description, int[] nums, int expected) {
        int result = solution.singleNumber(nums);

        assertEquals(expected, result);
    }

    static Stream<Arguments> singleNumberTestCases() {
        return Stream.of(
                Arguments.of("basic case", new int[]{2,2,1}, 1),
                Arguments.of("larger array", new int[]{4,1,2,1,2}, 4),
                Arguments.of("single element", new int[]{1}, 1),
                Arguments.of("negative numbers", new int[]{-1,-1,-2}, -2),
                Arguments.of("zero as unique", new int[]{0,1,1}, 0),
                Arguments.of("mixed negatives", new int[]{-3,2,2}, -3)
        );
    }
}