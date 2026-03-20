package org.example.br.com.zeroufal.kotlin.leetcode.containsduplicate

class Solution2 {
    fun containsDuplicate(nums: IntArray): Boolean {
        if (nums.size <= 1) return false

        var plus = 1;

        while (plus < nums.size) {
            var counter1 = 0
            var counter2 = plus

            while (counter1 < nums.size && counter2 < nums.size) {
                if (nums[counter1] == nums[counter2]) {
                    return true
                }

                counter1 ++
                counter2 = counter1 + plus
            }
            plus++
        }

        return false
    }
}

fun main() {
    val fileContent = Solution2::class.java.getResource("/content").readText().split(",")

    val nums = IntArray(fileContent.size)

    for(i in fileContent.indices) {
        nums[i] = fileContent[i].toInt()
    }

    println(Solution2().containsDuplicate(nums))
}