package org.example.com.marcos.leetcode.sametree

import org.example.com.marcos.lib.TreeNode

class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if(p == null && q == null) return true

        p?.let {
            q?.let {
                if(p.`val` == q.`val`) {
                    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
                }
            }
        }

        return false
    }
}

fun main() {
    val p = TreeNode(1)
    p.left = TreeNode(2)
    p.right = TreeNode(3)

    val q = TreeNode(1)
    q.left = TreeNode(2)
    q.right = TreeNode(2)

    println(Solution().isSameTree(p, q))
}