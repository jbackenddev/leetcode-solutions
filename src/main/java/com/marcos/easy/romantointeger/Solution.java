package com.marcos.easy.romantointeger;

class Solution {
    public static final int I_VALUE = 1;
    public static final int V_VALUE = 5;
    public static final int X_VALUE = 10;
    public static final int L_VALUE = 50;
    public static final int C_VALUE = 100;
    public static final int D_VALUE = 500;
    public static final int M_VALUE = 1000;

    public static final char I_NUMERAL = 'I';
    public static final char V_NUMERAL = 'V';
    public static final char X_NUMERAL = 'X';
    public static final char L_NUMERAL = 'L';
    public static final char C_NUMERAL = 'C';
    public static final char D_NUMERAL = 'D';
    public static final char M_NUMERAL = 'M';

    public int romanToInt(String s) {
        int romanNumber = 0;
        int i = 0;

        while (i < s.length()) {
            char numeral = s.charAt(i);

            if (numeral == I_NUMERAL) {
                if (s.length() > i + 1) {
                    int result = calculateSubtractBy(s.charAt(i + 1), I_VALUE, V_NUMERAL, V_VALUE, X_NUMERAL, X_VALUE);

                    if(result == 0) {
                        romanNumber += I_VALUE;
                    } else {
                        romanNumber += result;
                        i++;
                    }
                } else {
                    romanNumber += I_VALUE;
                }
            }

            if (numeral == X_NUMERAL) {
                if (s.length() > i + 1) {
                    int result = calculateSubtractBy(s.charAt(i + 1), X_VALUE, L_NUMERAL, L_VALUE, C_NUMERAL, C_VALUE);

                    if(result == 0) {
                        romanNumber += X_VALUE;
                    } else {
                        romanNumber += result;
                        i++;
                    }
                } else {
                    romanNumber += X_VALUE;
                }
            }

            if (numeral == C_NUMERAL) {
                if (s.length() > i + 1) {
                    int result = calculateSubtractBy(s.charAt(i + 1), C_VALUE, D_NUMERAL, D_VALUE, M_NUMERAL, M_VALUE);

                    if(result == 0) {
                        romanNumber += C_VALUE;
                    } else {
                        romanNumber += result;
                        i++;
                    }
                } else {
                    romanNumber += C_VALUE;
                }
            }

            if (numeral == V_NUMERAL) {
                romanNumber = romanNumber + V_VALUE;
            }

            if (numeral == L_NUMERAL) {
                romanNumber = romanNumber + L_VALUE;
            }

            if (numeral == D_NUMERAL) {
                romanNumber = romanNumber + D_VALUE;
            }

            if (numeral == M_NUMERAL) {
                romanNumber = romanNumber + M_VALUE;
            }

            i++;
        }

        return romanNumber;
    }

    private int calculateSubtractBy(char nextNumeral, int toSubtract, char before1,
                                    int from1, char before2, int from2) {
        int result = 0;

        if (nextNumeral == before1) {
            result = from1 - toSubtract;
        } else if (nextNumeral == before2) {
            result = from2 - toSubtract;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("MCMXCIV"));
    }
}