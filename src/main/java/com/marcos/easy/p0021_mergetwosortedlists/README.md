# 21. Merge Two Sorted Lists
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

---

## 💡 Approach
The solution uses an **iterative two-pointer technique** to merge two sorted linked lists.
We create a dummy node (`listHead`) to simplify handling of the head of the merged list. A pointer (`listNext`) is used to build the new list.
We iterate through both lists simultaneously:
- If both nodes have the same value, we add both values to the merged list.
- If one value is smaller, we add the smaller node and move its pointer forward.
- This process continues until one of the lists is fully traversed.
After the loop, if any nodes remain in either list, we directly append them to the result.
Finally, we return `listHead.next` to skip the dummy node.

---

## 🧠 Why This Approach?

This approach is efficient because it minimizes unnecessary comparisons by:
 - Starting with the shortest string, which bounds the maximum prefix size.
 - Shrinking the prefix early when mismatches occur, reducing future comparisons.
 - Avoiding extra space usage, keeping the solution simple and memory-efficient.
Compared to other approaches (like sorting or divide-and-conquer), this method is straightforward, easy to implement, and performs well within constraints.

---

## ⚠️ Edge Cases
- Both lists are `null` → return `null`
- One list is `null` → return the other list directly
- Lists with:
    - Different lengths
    - Duplicate values
    - Negative values
- All elements of one list are smaller than the other

---

## ⏱ Complexity
- **Time Complexity:** O(n + m): We traverse both lists once, where `n` and `m` are the lengths of `list1` and `list2`.
- **Space Complexity:** O(n + m): A new merged linked list is created.

---

## 🔗 Problem
https://leetcode.com/problems/merge-two-sorted-lists/

## ✅ Result

![Accepted](./accepted.png)

- Runtime: 0 ms (Beats 100.00%)
- Memory: 44.50 MB (Beats 11.78%)

---

## 🔗 Submission (login required)
https://leetcode.com/problems/merge-two-sorted-lists/submissions/1930798730