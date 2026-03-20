package com.marcos.easy.sqrt;

class Solution {
    public int mySqrt(int x) {
        double root = -1;

        do {
            root++;
            if ((root * root) == x) {
                return (int) root;
            }
        } while(root * root < x);

        return (int) --root;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.mySqrt(2147395801));
    }
}