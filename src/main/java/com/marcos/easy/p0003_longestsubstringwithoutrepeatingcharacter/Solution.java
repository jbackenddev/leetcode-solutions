package com.marcos.easy.p0003_longestsubstringwithoutrepeatingcharacter;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;

        StringBuilder letters = new StringBuilder();

        int starter = 0;
        int i = starter;

        while(i < s.length()) {
            String letter = String.valueOf(s.charAt(i));

            if (letters.indexOf(letter) == -1) {
                letters.append(letter);
                i++;
            } else {
                if (letters.length() > result) {
                    result = letters.length();
                }

                letters = new StringBuilder();
                starter++;
                i = starter;
            }
        }

        if (letters.length() > result) {
            result = letters.length();
        }

        return result;
    }
}