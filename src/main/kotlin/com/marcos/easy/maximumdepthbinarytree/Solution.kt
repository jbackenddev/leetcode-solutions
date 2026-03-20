package org.example.com.marcos.leetcode.maximumdepthbinarytree

import org.example.com.marcos.lib.TreeNode

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        var resultado = 0

        root?.let {
            val retornoLadoEsquerdo = walk(root.left, 1)

            if (retornoLadoEsquerdo > resultado) {
                resultado = retornoLadoEsquerdo
            }

            val retornoLadoDireito = walk(root.right, 1)

            if (retornoLadoDireito > resultado) {
                resultado = retornoLadoDireito
            }
        }

        return resultado
    }

    private fun walk(root: TreeNode?, depth: Int) : Int {
        if(root != null) {
            val depthLeft = walk(root.left, depth + 1)

            val depthRight = walk(root.right, depth + 1)

            return if (depthRight >= depthLeft) { depthRight } else { depthLeft }
        }

        return depth
    }
}

fun main() {
    val p = TreeNode(3)
    //p.left = TreeNode(2)
    p.right = TreeNode(4)

    //val q = TreeNode(1)
    //q.left = TreeNode(2)
    //q.right = TreeNode(2)

    val root = TreeNode(2)
    //root.left = q
    root.right = p

    println(Solution().maxDepth(root))
}