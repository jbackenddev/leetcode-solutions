package com.marcos.easy.p0021_mergetwosortedlists;

import com.marcos.javalib.ListNode;
import com.marcos.javalib.ListNodeService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @DisplayName("Merge Two Sorted Lists - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("mergeTwoSortedListsTestCases")
    void shouldMergeTwoSortedListsCorrectly(String description, ListNode list1, ListNode list2, ListNode expected) {
        ListNode result = solution.mergeTwoLists(list1, list2);

        assertEquals(expected, result);
    }

    static Stream<Arguments> mergeTwoSortedListsTestCases() {
        return Stream.of(
                // Basic
                Arguments.of("basic case",
                        ListNodeService.mapToListNode(new Integer[] {1,2,4}),
                        ListNodeService.mapToListNode(new Integer[] {1,3,4}),
                        ListNodeService.mapToListNode(new Integer[] {1,1,2,3,4,4})),
                Arguments.of("different sizes",
                        ListNodeService.mapToListNode(new Integer[] {1,2}),
                        ListNodeService.mapToListNode(new Integer[] {1,3,4,5}),
                        ListNodeService.mapToListNode(new Integer[] {1,1,2,3,4,5})),
                Arguments.of("all elements smaller",
                        ListNodeService.mapToListNode(new Integer[] {1,2,3}),
                        ListNodeService.mapToListNode(new Integer[] {4,5,6}),
                        ListNodeService.mapToListNode(new Integer[] {1,2,3,4,5,6})),
                Arguments.of("empty lists",
                        ListNodeService.mapToListNode(new Integer[] {}),
                        ListNodeService.mapToListNode(new Integer[] {}),
                        ListNodeService.mapToListNode(new Integer[] {})),
                Arguments.of("empty lists",
                        ListNodeService.mapToListNode(new Integer[] {}),
                        ListNodeService.mapToListNode(new Integer[] {0}),
                        ListNodeService.mapToListNode(new Integer[] {0})),
                Arguments.of("negative values",
                        ListNodeService.mapToListNode(new Integer[] {-3,-1,2}),
                        ListNodeService.mapToListNode(new Integer[] {-2,0,3}),
                        ListNodeService.mapToListNode(new Integer[] {-3,-2,-1,0,2,3}))
        );
    }
}