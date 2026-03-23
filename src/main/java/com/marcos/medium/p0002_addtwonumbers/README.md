# 2. Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

---

## 💡 Approach
The solution follows an iterative approach simulating manual addition, processing both linked lists digit by digit while maintaining a carry (vai1).

Key implementation details:
- Instead of using a dummy node, the first node of the result list is created before entering the loop.
- Two pointers (next1 and next2) are used to traverse the input lists.
- A do-while loop ensures that the algorithm continues as long as at least one list still has nodes.
- At each step:
  - The sum is calculated using current node values and the carry.
  - If the sum is greater than or equal to 10, a carry is generated.
  - A new node is appended to the result list.
- After the loop, if there is a remaining carry, it is appended as a new node.

---

## ⚠️ Edge Cases

This implementation explicitly handles:

- Lists with different sizes
  - Separate branches for next1 != null and next2 != null
- Carry propagation across iterations
  - Example: [9,9,9] + [1] → [0,0,0,1]
- Final carry after loop انتهاء
  - If vai1 != 0, a new node is appended
- Single-node lists
  - Works correctly due to initial pre-loop handling
- Null safety during iteration
  - Each branch checks whether nodes exist before accessing values

---

## ⏱ Complexity
- Time: O(n^2), This is a brute-force approach with O(n²) time complexity due to the nested loops.
- Space: O(1), Space complexity is O(1) since no additional data structures are used..

---

## 🧠 Why this approach?
- Avoids reversing the input lists
- Works in a single pass
- Handles lists of different sizes explicitly
- Keeps control over the first node creation (no dummy node)

---

## 🔗 Problem
https://leetcode.com/problems/add-two-numbers/

---

## ✅ Result

![Accepted](accepted.png)

- Runtime: 1 ms (Beats 99.91%)
- Memory: 46.58 MB (Beats 51.47%)

---

## 🔗 Submission (login required)
https://leetcode.com/problems/add-two-numbers/submissions/1927451962