package com.marcos.easy.p0112_pathsum;

import com.marcos.javalib.TreeNode;
import com.marcos.javalib.TreeNodeService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @DisplayName("Path Sum - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("pathSumTestCases")
    void shouldEvaluatePathSumCorrectly(String description, Integer[] input, int targetSum, boolean expected) {
        TreeNode root = TreeNodeService.mapToTreeNode(input);

        boolean result = solution.hasPathSum(root, targetSum);

        assertEquals(expected, result);
    }

    static Stream<Arguments> pathSumTestCases() {
        return Stream.of(
                Arguments.of("empty array", new Integer[]{}, 0, false),
                Arguments.of("null root", new Integer[]{null}, 1, false),
                Arguments.of("single level valid", new Integer[]{1,2}, 3, true),
                Arguments.of("single level invalid", new Integer[]{1,2}, 1, false),
                Arguments.of("simple tree valid", new Integer[]{1,2,3}, 4, true),
                Arguments.of("simple tree valid (right)", new Integer[]{1,2,3}, 3, true),
                Arguments.of("simple tree invalid", new Integer[]{1,2,3}, 5, false),
                Arguments.of("deep path valid",
                        new Integer[]{5,4,8,11,null,13,4,7,2,null,null,null,1},
                        22,
                        true
                ),
                Arguments.of("negative values",
                        new Integer[]{-2,null,-3},
                        -5,
                        true
                )
        );
    }
}