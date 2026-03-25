package com.marcos.easy.p0026_removeduplicatesfromsortedarray;

class Solution {
    public int removeDuplicates(int[] nums) {
        int[] expectedNums = new int[nums.length];
        int currentElement = -101;
        int head = 0;
        int tail = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (currentElement != nums[i]) {
                expectedNums[head++] = nums[i];
                currentElement = nums[i];
            } else {
                expectedNums[--tail] = nums[i];
            }
        }

        return head;
    }

}