package com.marcos.easy.p0283_movezeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int place = -1;
        int counter = 0;

        while(i < nums.length) {
            if(nums[i] != 0 && counter != 0) {
                if (place != i) {
                    nums[place] = nums[i];
                    place++;
                }
            } else if (nums[i] == 0){
                if (place == -1) {
                    place = i;
                }
                counter++;
            }

            i++;
        }

        while (counter > 0) {
            nums[nums.length - counter] = 0;
            counter--;
        }
    }
}
