# 13. Roman to Integer
Given a roman numeral, convert it to an integer.

---

## 💡 Approach

The solution iterates through the Roman numeral string from left to right, evaluating each character and determining whether it should be added directly or used in a subtractive combination.

For numerals that can form subtractive pairs (`I`, `X`, `C`), the algorithm looks ahead to the next character. If a valid subtractive pattern is detected (e.g., `IV`, `IX`, `XL`, `XC`, `CD`, `CM`), it calculates the difference and skips the next character. Otherwise, it simply adds the current numeral's value.

A helper method `calculateSubtractBy` centralizes the logic for detecting and computing subtractive cases, reducing duplication and improving readability.

For numerals that cannot form subtractive pairs (`V`, `L`, `D`, `M`), their values are directly added to the result.

---

## 🧠 Why This Approach?

This approach closely mirrors the natural rules of Roman numerals, making it intuitive and easy to reason about.
Instead of using a map or performing reverse iteration, the solution explicitly handles each numeral and its valid subtractive combinations. This makes the logic very clear and avoids unnecessary data structures.
The use of constants for both characters and values improves readability and avoids magic numbers. Additionally, the helper method encapsulates the subtractive logic, making the code more modular and easier to maintain.

---

## ⚠️ Edge Cases

- **Single character input**  
  Example: `"I"` → directly returns its value.
- **Subtractive notation at the end**  
  Example: `"IV"`, `"IX"` → correctly handled using lookahead logic.
- **Multiple subtractive cases**  
  Example: `"MCMXCIV"` → ensures index skipping works correctly after processing a pair.
- **No subtractive cases**  
  Example: `"III"`, `"LVIII"` → all numerals are simply added.
- **Last character handling**  
  Ensures no out-of-bounds access when checking `i + 1`.

---

## ⏱ Complexity

- **Time Complexity:** `O(n)`: The algorithm processes each character at most once. In cases of subtractive pairs, it skips the next character, but overall still runs in linear time.
- **Space Complexity:** `O(1)`: No additional data structures are used; only a few variables and constants are maintained.

---

## 🔗 Problem
https://leetcode.com/problems/roman-to-integer/

## ✅ Result

![Accepted](./accepted.png)

- Runtime: 2 ms (Beats 99.91%)
- Memory: 46.32 MB (Beats 83.62%)

---

## 🔗 Submission (login required)
https://leetcode.com/problems/roman-to-integer/submissions/1929466720