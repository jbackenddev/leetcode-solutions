package com.marcos.medium.p0006_zigzagconversion;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<List<Character>> matrix = new ArrayList<>();

        for(int i = 1; i <= numRows; i++) {
            matrix.add(new ArrayList<>());
        }

        char[] letters = s.toCharArray();

        int rowcount = -1;
        int direction = 1;

        for(int j = 0; j < letters.length; j++) {
            if (rowcount >= numRows - 1) {
                direction = -1;
            }

            if (rowcount <= 0) {
                direction = 1;
            }

            rowcount += direction;
            matrix.get(rowcount).add(letters[j]);
        }

        StringBuilder result = new StringBuilder();

        for(List<Character> lista: matrix) {
            for(Character c: lista) {
                result.append(c);
            }
        }

        return result.toString();
    }
}
