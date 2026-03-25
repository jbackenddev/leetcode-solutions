# 70. Climbing Stair
Given an integer `n`, return the number of distinct ways to climb to the top.
Each time you can either climb **1 or 2 steps**.

---

## 💡 Approach
This solution models the problem using **recursion and decision trees**.

At each step, we have two possible choices:
- Climb 1 step
- Climb 2 steps

The algorithm explores all possible paths until it reaches exactly `n`.

---

## 🧠 Why this approach?
Although this resembles the Fibonacci sequence, this implementation intentionally **does not use dynamic programming**, in order to explicitly demonstrate the recursive exploration of the solution space.

---

## ⚠️ Edge Cases
### 1. Minimum Input
    ```text
    Input: n = 1  
    Output: 1
    - Only one possible way: 1 step

### 2. Small Input
    ```text
    Input: n = 2  
    Output: 2
    - Two possible ways: 1 + 1; and 2

### 3. First Non-Trivial Case
    ```text
    Input: n = 3  
    Output: 3
    - Two possible ways: 1 + 1; and 2

### 4. Larger Input (Growth Behavior)
    ```text
    Input: n = 5  
    Output: 8
    - Demonstrates exponential growth in recursive calls
    - Highlights inefficiency of naive recursion

### 5. Edge of Constraint (Performance Limit)
    ```text
    Input: n = 45  
    Output: 1836311903
    - Demonstrates exponential growth in recursive calls
    - Highlights inefficiency of naive recursion

---

## ⏱ Complexity
-   **Time Complexity:** `O(2ˆn)`
-   **Space Complexity:** `O(n)` - Due to recursion stack depth

---

## 🔗 Problem
https://leetcode.com/problems/climbing-stairs/

---

## ✅ Result

![Accepted](./accepted.png)

- Runtime: 0 ms (Beats 100%)
- Memory: 41.93 MB (Beats 82.29%)

---

## 🔗 Submission (login required)
https://leetcode.com/problems/add-binary/submissions/1934140212