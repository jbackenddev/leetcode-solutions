# 12. Integer to Roman
Represent Roman numerals from int numbers.

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
- **Minimum value (1)**  
  Should return `"I"`.

- **Maximum value (3999)**  
  Roman numerals typically stop at 3999 → `"MMMCMXCIX"`.

- **Digits equal to 0**  
  These are naturally skipped since they don't contribute to the result.

- **Subtractive notation cases (4 and 9)**  
  Must be handled explicitly (e.g., IV, IX, XL, XC, CD, CM).

---

## ⏱ Complexity
- **Time Complexity:** `O(1)` - The number of digits is bounded (maximum 4 digits), so the loop runs a constant number of times.

- **Space Complexity:** `O(1)` - Only a fixed amount of extra space is used (maps and result string).

---

## 🧠 Why this approach?
This approach is efficient and structured because:
- It **mirrors how humans read Roman numerals**, processing digit by digit.
- It avoids hardcoding all possible values (like greedy arrays), making it more **flexible and readable**.
- The use of maps (`xMap` and `vMap`) keeps the logic **clean and extensible**.
- Handling each digit independently simplifies the implementation of Roman numeral rules, especially **subtractive cases (4 and 9)**.

---

## 🔗 Problem
https://leetcode.com/problems/integer-to-roman/

---

## ✅ Result

![Accepted](accepted.png)

- Runtime: 4 ms (Beats 33.89%)
- Memory: 45.93 MB (Beats 97.93%)

---

## 🔗 Submission (login required)
https://leetcode.com/problems/integer-to-roman/submissions/1965478182