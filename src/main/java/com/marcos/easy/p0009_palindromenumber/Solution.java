package com.marcos.easy.p0009_palindromenumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        List<Integer> nums = new ArrayList<>();

        do {
            nums.add(x % 10);
            x = x / 10;
        } while(x > 0);

        for(int start = 0, end = nums.size() - 1; start <= nums.size() / 2; start++, end--) {
            if (!nums.get(start).equals(nums.get(end))) {
                return false;
            }
        }

        return true;
    }

}
