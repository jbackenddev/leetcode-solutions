package com.marcos.easy.p0067addbinary;

class Solution {
    public String addBinary(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        int lengthResult = lengthA + 1;

        if (lengthA < lengthB) {
            lengthResult = lengthB + 1;
        }

        char[] result = new char[lengthResult];
        boolean plusOne = false;

        while(lengthA > 0 || lengthB > 0) {
            char sum = addTwo(
                    getValue(lengthA, a),
                    getValue(lengthB, b));

            if (plusOne) {
                if (sum == '2') {
                    sum = '1';
                } else if (sum == '1') {
                    sum = '0';
                } else {
                    sum = '1';
                    plusOne = false;
                }
            }

            if (sum == '2') {
                plusOne = true;
                sum = '0';
            }

            result[lengthResult - 1] = sum;

            lengthA--;
            lengthB--;
            lengthResult--;
        }

        if (plusOne) {
            result[lengthResult - 1] = '1';
        }

        StringBuilder solution = new StringBuilder();

        for(int i = 0; i < result.length; i++) {
            if (result[i] != '\u0000') {
                solution.append(result[i]);
            }
        }

        return solution.toString();
    }

    private char getValue(int position, String binary) {
        if (position > 0) {
            return binary.charAt(position - 1);
        }

        return '0';
    }

    private char addTwo(char x, char y) {
        if (x == '0' && y == '0') {
            return '0';
        } else if (x == '1' && y == '1') {
            return '2';
        } else {
            return '1';
        }
    }
}