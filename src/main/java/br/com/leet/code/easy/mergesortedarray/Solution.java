package br.com.leet.code.easy.mergesortedarray;

import java.util.Arrays;

class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            result[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            result[k] = nums2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];

        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        nums1[3] = 0;
        nums1[4] = 0;
        nums1[5] = 0;

        nums2[0] = 2;
        nums2[1] = 5;
        nums2[2] = 6;

        Solution s = new Solution();
        Arrays.stream(s.merge(nums1, m, nums2, n)).forEach(System.out::println);
    }
}