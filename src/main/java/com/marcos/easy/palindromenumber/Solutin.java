package com.marcos.easy.palindromenumber;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }


        StringBuilder input = new StringBuilder(String.valueOf(x));
        StringBuilder reversedInput = new StringBuilder(String.valueOf(x)).reverse();

        if (input.compareTo(reversedInput) == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(121));
    }
}