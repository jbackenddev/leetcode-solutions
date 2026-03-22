# 9. Palindrome Number
Given an integer x, return true if x is a palindrome, and false otherwise.

---

## 💡 Approach

The solution checks whether a number is a palindrome by:

1. Handling simple edge cases:
    - Negative numbers are not palindromes
    - Single-digit numbers are always palindromes

2. Extracting all digits from the number:
    - Repeatedly take the last digit using modulo (`x % 10`)
    - Store digits in a list

3. Comparing digits from both ends:
    - Use two pointers (`start` and `end`)
    - Move inward and compare values

If all mirrored digits match, the number is a palindrome.

---

## ⚖️ Trade-offs

### Current Approach (List-based)

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

**Pros:**
- Simple and easy to understand
- Explicit representation of digits
- Good for readability and debugging

**Cons:**
- Uses extra space to store digits
- Not the most optimal solution

---

### Alternative Approach (Reversing Half)

- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

**Pros:**
- Optimal in both time and space
- No additional data structures required

**Cons:**
- Slightly more complex to implement
- Less intuitive at first glance

---

## 🧠 Why This Approach?

This implementation prioritizes **clarity and correctness** over optimal performance.

Given the context of solving multiple problems and reinforcing fundamentals, a straightforward approach was chosen to maintain speed of iteration and code readability.

The optimal solution is well-known and can be applied when necessary.

---

## ⚠️ Edge Cases

- Negative numbers → always false
- Single digit numbers → always true
- Numbers ending in zero (e.g., 10) → false
- Large numbers
- Zero → true

---

## ⏱ Complexity

- **Time:** O(n), where n is the number of digits
- **Space:** O(n)

---

## 🧪 Tests

The solution is validated using **JUnit 5 parameterized tests**, covering:

- Standard cases
- Edge cases
- Negative numbers
- Large inputs

---

## 🔗 Problem
https://leetcode.com/problems/palindrome-number/

## ✅ Result

![Accepted](./accepted.png)

- Runtime: 6 ms (Beats 22.69%)
- Memory: 45.92 MB (Beats 67.54%)