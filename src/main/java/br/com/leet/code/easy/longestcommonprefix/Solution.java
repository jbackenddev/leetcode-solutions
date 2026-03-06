package br.com.leet.code.easy.longestcommonprefix;

class Solution {
    private String getInitialPrefix(String[] strs) {
        String prefix = strs[0];
        int i = 0;
        int size = strs[0].length();

        while(i < strs.length && size > 1) {
            if(strs[i].length() < size) {
                size = strs[i].length();
                prefix = strs[i];
            }

            i++;
        }

        return prefix;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length <= 0) {
            return "";
        }

        String prefix = getInitialPrefix(strs);

        for(int i = 0; i < strs.length; i++) {
            for(int j = 0; j < prefix.length(); j++) {
                if (strs[i].charAt(j) != prefix.charAt(j)) {
                    prefix = prefix.substring(0, j);

                    break;
                }
            }

            if (prefix.isEmpty()) {
                return prefix;
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"reflower","flow","flight"}));
    }
}