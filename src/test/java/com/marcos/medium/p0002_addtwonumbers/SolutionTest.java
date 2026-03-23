package com.marcos.medium.p0002_addtwonumbers;

import com.marcos.javalib.ListNode;
import com.marcos.javalib.ListNodeService;
import com.marcos.medium.p0002_addtwonumbers.Solution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @DisplayName("Add Two Numbers - Valid scenarios")
    @ParameterizedTest(name = "{0}")
    @MethodSource("addTwoNumbersTestCases")
    void shouldAddTwoNumbersAsLinkedList(String description, ListNode l1, ListNode l2, ListNode expected) {
        ListNode result = solution.addTwoNumbers(l1, l2);

        assertEquals(expected, result);
    }

    static Stream<Arguments> addTwoNumbersTestCases() {
        return Stream.of(
                Arguments.of("basic case",
                        ListNodeService.mapToListNode(new Integer[] {2, 4, 3}),
                        ListNodeService.mapToListNode(new Integer[] {5, 6, 4}),
                        ListNodeService.mapToListNode(new Integer[] {7, 0, 8})),
                Arguments.of("lists with 0 value",
                        ListNodeService.mapToListNode(new Integer[] {0}),
                        ListNodeService.mapToListNode(new Integer[] {0}),
                        ListNodeService.mapToListNode(new Integer[] {0})),
                Arguments.of("first list bigger than second one",
                        ListNodeService.mapToListNode(new Integer[] {9,9,9,9,9,9,9}),
                        ListNodeService.mapToListNode(new Integer[] {9,9,9,9}),
                        ListNodeService.mapToListNode(new Integer[] {8,9,9,9,0,0,0,1}))
        );
    }
}