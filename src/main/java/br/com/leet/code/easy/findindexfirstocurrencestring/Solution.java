package br.com.leet.code.easy.findindexfirstocurrencestring;

class Solution {
    public int strStr(String haystack, String needle) {
        int result = -1;
        int position = 0;
        int i = 0;

        while(i < haystack.length()) {
            if (haystack.length() - i < needle.length() - position) {
                break;
            }

            if (position >= needle.length()) {
                break;
            }

            if (needle.charAt(position) == haystack.charAt(i)) {
                position++;

                if (result == -1) {
                    result = i;
                }
            } else {
                if (result != -1) {
                    position = 0;
                    i = result;
                    result = -1;
                }
            }

            i++;
        }

        if (position != needle.length()) {
            result = -1;
        }

        return result;
    }

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";

        System.out.println(new Solution().strStr(haystack, needle));
    }
}