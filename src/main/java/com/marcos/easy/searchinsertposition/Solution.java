package com.marcos.easy.searchinsertposition;

class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums[0] <= target) {
            return 0;
        }

        if (nums[nums.length - 1] > target) {
            return nums.length;
        }

        return  binarySearch(nums, target, 0, nums.length);
    }

    public int binarySearch(int[] nums, int target, int low, int high) {
        int middle = low  + ((high - low) / 2);

        if (high < low) {
            return middle;
        }

        if (target < nums[middle]) {
            return binarySearch(nums, target, low, middle - 1);
        } else if (target > nums[middle]) {
            return binarySearch(nums, target, middle + 1, high);
        } else {
            return middle;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[] {1,3}, 2));
    }

}