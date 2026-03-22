# 112. Path Sum
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

---

## 💡 Approach
Traverse the tree using DFS, accumulating the sum along the path. 
When reaching a leaf node, check if the accumulated sum equals the target. 
If yes, return true. Otherwise, continue searching.

---

## 🧠 Why this approach?
Chosen for optimal time complexity and clarity.

---

## ⚠️ Edge Cases

- Empty tree (root == null)
- Single node equal to target
- Negative values in the tree

---

## ⏱ Complexity
- Time: O(n), since we may need to visit every node.
- Space: O(h), where h is the height of the tree, due to recursion stack. In the worst case, it becomes O(n).

---

## 🔗 Problem
https://leetcode.com/problems/path-sum/

---

## ✅ Result

![Accepted](./accepted.png)

- Runtime: 0 ms (Beats 100.00%)
- Memory: 44.86 MB (Beats 78.73%)

---

## 🔗 Submission (login required)
https://leetcode.com/problems/path-sum/submissions/1955125392