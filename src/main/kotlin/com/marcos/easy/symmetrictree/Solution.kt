package org.example.com.marcos.leetcode.symmetrictree

import org.example.com.marcos.lib.TreeNode

class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        root?.let {
            return compare(root.left, root.right)
        }

        return false
    }

    private fun compare(p: TreeNode?, q: TreeNode?): Boolean {
        if(p == null && q == null) return true

        p?.let {
            q?.let {
                if (p.`val` == q.`val`) {
                    return compare(p.right, q.left) && compare(p.left, q.right)
                }
            }
        }

        return false
    }
}

fun main() {
    val p = TreeNode(2)
    p.left = TreeNode(4)
    p.right = TreeNode(3)

    val q = TreeNode(2)
    q.left = TreeNode(4)
    q.right = TreeNode(3)

    val root = TreeNode(1)
    root.left = p
    root.right = q

    println(Solution().isSymmetric(root))
}