package com.marcos.easy.p0392_issubsequence;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int pointerToS = 0;

        for(int j = 0; j < t.length(); j++) {
            if(s.charAt(pointerToS) == t.charAt(j)) {
                pointerToS++;

                if (pointerToS >= s.length()) {
                    break;
                }
            }
        }

        return pointerToS == s.length();
    }
}
