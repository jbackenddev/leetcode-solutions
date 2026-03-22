package com.marcos.easy.p0136_singlenumber;

public class Solution {
    public int singleNumber(int[] nums) {
        int accumulator = 0;

        for(int num: nums) {
            accumulator = accumulator ^ num;
        }

        return accumulator;
    }
}
