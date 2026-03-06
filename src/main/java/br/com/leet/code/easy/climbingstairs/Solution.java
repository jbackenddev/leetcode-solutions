package br.com.leet.code.easy.climbingstairs;

public class Solution {
    public int climbStairs(int n) {
        long result = 0;

        result += jump(0, 1, n, 0) + jump(0, 2, n, 0) ;

        return (int) result;
    }

    private int jump(int step, int jump, int n, int counter) {
        int current = step + jump;

        if (current < n) {
            return jump(current, 1, n, counter) + jump(current, 2, n, counter);
        } else if (current == n) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(45));

    }
}
