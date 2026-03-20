package org.example.com.marcos.leetcode.containsduplicate

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        if (nums.size <= 1) return false

        for(i in 0..<nums.size - 1) {
            for(j in i + 1..<nums.size) {
                if (nums[i] == nums[j]) {
                    return true
                }
            }
        }

        return false
    }
}

fun main() {
    val fileContent = Solution::class.java.getResource("/content").readText().split(",")

    val nums = IntArray(fileContent.size)

    for(i in fileContent.indices) {
        nums[i] = fileContent[i].toInt()
    }

    println(Solution().containsDuplicate(nums))
}