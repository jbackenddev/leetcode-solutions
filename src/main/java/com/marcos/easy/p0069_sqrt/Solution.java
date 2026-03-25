package com.marcos.easy.p0069_sqrt;

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
}