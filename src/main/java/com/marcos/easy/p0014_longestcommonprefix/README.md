# 14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

---

## 💡 Approach
The solution starts by selecting an initial candidate prefix. Instead of arbitrarily choosing the first string, it finds the shortest string in the array, since the longest possible common prefix cannot exceed its length.

Then, it iterates through each string and compares characters one by one with the current prefix. If a mismatch is found, the prefix is reduced (trimmed) up to the mismatch index.

This process continues until all strings are checked or the prefix becomes empty.

---

## 🧠 Why This Approach?

This approach is efficient because it minimizes unnecessary comparisons by:
 - Starting with the shortest string, which bounds the maximum prefix size.
 - Shrinking the prefix early when mismatches occur, reducing future comparisons.
 - Avoiding extra space usage, keeping the solution simple and memory-efficient.
Compared to other approaches (like sorting or divide-and-conquer), this method is straightforward, easy to implement, and performs well within constraints.

---

## ⚠️ Edge Cases

- **Empty input array**: Returns an empty string.
- **Single string in array**: The string itself is the prefix.
- **No common prefix**: Returns an empty string when the first mismatch occurs. 
- **Strings of different lengths**: Handled by choosing the shortest string as the initial prefix.
- **All strings identical**: The full string is returned as the prefix. 

---

## ⏱ Complexity

- **Time Complexity:** `O(n.m)`: n = number of strings; m = length of the shortest string. In the worst case, we compare each character of each string.
- **Space Complexity:** `O(1)`: No additional data structures are used aside from a few variables.

---

## 🔗 Problem
https://leetcode.com/problems/longest-common-prefix/

## ✅ Result

![Accepted](./accepted.png)

- Runtime: 1 ms (Beats 68.78%)
- Memory: 43.64 MB (Beats 6.82%)

---

## 🔗 Submission (login required)
https://leetcode.com/problems/longest-common-prefix/submissions/1929543856