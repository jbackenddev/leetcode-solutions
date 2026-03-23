# 67. Add Binary
Given two binary strings a and b, return their sum as a binary string.

---

## 💡 Approach
-   Define the result size as `max(a, b) + 1`
-   Use a `char[]` to avoid dynamic memory reallocations
-   Iterate while there are still digits in `a` or `b`
-   Use helper methods:
    -   `getValue()` → safely returns `'0'` when index is out of bounds
    -   `addTwo()` → sums two bits and returns `'0'`, `'1'`, or `'2'`

---

## 🧠 Why this approach?
I chose this approach to:

-   Avoid converting strings to integers (which could overflow for large
    inputs)
-   Keep the solution efficient and close to how binary addition
    actually works
-   Maintain full control over the carry logic
-   Optimize performance by using a fixed-size `char[]` instead of
    dynamic structures

This makes the solution both **predictable** and **scalable** for large
inputs.

---

## ⚠️ Edge Cases

-   **Different lengths**\
    Example: `"1"` + `"111"` → handled via `getValue()` returning `'0'`

-   **Final carry remaining**\
    Example: `"1"` + `"1"` → `"10"`

-   **All zeros**\
    Example: `"0"` + `"0"` → `"0"`

-   **Large inputs**\
    Avoids overflow since no numeric conversion is used

-   **Leading position unused in array**\
    Handled by skipping `\u0000` characters when building the result

---

## ⏱ Complexity
-   **Time Complexity:** `O(max(n, m))`
-   **Space Complexity:** `O(max(n, m))`

Where: - `n = a.length` - `m = b.length`

---

## 🔗 Problem
https://leetcode.com/problems/add-binary/

---

## ✅ Result

![Accepted](./accepted.png)

- Runtime: 1 ms (Beats 99.92%)
- Memory: 43.39 MB (Beats 93.19%)

---

## 🔗 Submission (login required)
https://leetcode.com/problems/add-binary/submissions/1934140212