package com.marcos.medium.p0012_integertoroman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private static final Map<Integer, String> xMap = new HashMap<>();
    private static final Map<Integer, String> vMap = new HashMap<>();

    static {
        xMap.put(0, "I");
        xMap.put(1, "X");
        xMap.put(2, "C");
        xMap.put(3, "M");

        vMap.put(0, "V");
        vMap.put(1, "L");
        vMap.put(2, "D");
    }

    public String intToRoman(int num) {
        List<Integer> numbers = convertIntToList(num);

        StringBuilder result = new StringBuilder();

        for(int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) <= 3) {
                for(int j = 0; j < numbers.get(i); j++) {
                    result.append(xMap.get(i));
                }
            } else if (numbers.get(i) == 4) {
                result.append(xMap.get(i));
                result.append(vMap.get(i));
            } else if (numbers.get(i) == 5) {
                result.append(vMap.get(i));
            } else if (numbers.get(i) <= 8) {
                result.append(vMap.get(i));

                for(int j = 0; j < numbers.get(i) - 5; j++) {
                    result.append(xMap.get(i));
                }
            } else if (numbers.get(i) <= 9) {
                result.append(xMap.get(i));
                result.append(xMap.get(i+1));
            }
        }

        return result.toString();
    }

    private List<Integer> convertIntToList(int num) {
        List<Integer> numbers = new ArrayList<>();

        int multiplier = 1;

        while(num > 0) {
            numbers.add(num % 10 * multiplier);
            num = num / 10;
        }

        return numbers;
    }

}