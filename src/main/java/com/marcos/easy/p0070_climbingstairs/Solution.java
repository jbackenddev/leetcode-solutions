package com.marcos.easy.p0070_climbingstairs;

public class Solution {
    public int climbStairs(int n) {
        int result = 0;

        result += jump(0, 1, n) + jump(0, 2, n) ;

        return result;
    }

    private int jump(int step, int jump, int n) {
        int current = step + jump;

        if (current < n) {
            return jump(current, 1, n) + jump(current, 2, n);
        } else if (current == n) {
            return 1;
        } else {
            return 0;
        }
    }
}
