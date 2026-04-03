# 136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

---

## 💡 Approach

The solution uses **bit manipulation (XOR)** to identify the unique element.

## 🧠 Why this approach?
Chosen for optimal time complexity and clarity.

## ⏱ Complexity
- Time: O(n), since we may need to visit every node.
- Space: O(h), where h is the height of the tree, due to recursion stack. In the worst case, it becomes O(n).

---

## 🔗 Problem
https://leetcode.com/problems/single-number/

---

## ✅ Result

![Accepted](./accepted.png)

- Runtime: 1 ms (Beats 99.97%)
- Memory: 46.76 MB (Beats 89.94%)

---

## 🔗 Submission (login required)
https://leetcode.com/problems/single-number/submissions/1955190041