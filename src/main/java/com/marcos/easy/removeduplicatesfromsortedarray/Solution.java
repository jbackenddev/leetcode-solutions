package com.marcos.easy.removeduplicatesfromsortedarray;

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

    public static void main(String[] args) {
        int[] nums = new int[] {1,1,2};
        int[] expectedNums = new int[] {1,2};

        int k = new Solution().removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}