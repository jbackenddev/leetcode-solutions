package com.marcos.easy.p0001_twosum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @DisplayName("Two Sum - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("twoSumTestCases")
    void shouldFindTwoSum(String description, int[] nums, int target, int[] expected) {
        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    static Stream<Arguments> twoSumTestCases() {
        return Stream.of(
                Arguments.of("basic case", new int[]{2,7,11,15}, 9, new int[]{0,1}),
                Arguments.of("unordered input", new int[]{3,2,4}, 6, new int[]{1,2}),
                Arguments.of("duplicate values", new int[]{3,3}, 6, new int[]{0,1})
        );
    }
}