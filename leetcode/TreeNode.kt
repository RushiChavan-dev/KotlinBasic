package bsic.leetcode



/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {

        if (root == null) {
            return null
        }

        var tempNode = root.left
        root.left = root.right
        root.right = tempNode

        invertTree(root.left)
        invertTree(root.right)


        return root
    }
}

fun main() {
    // Construct the binary tree from the given input
    val root = TreeNode(4)
    root.left = TreeNode(2).apply {
        left = TreeNode(1)
        right = TreeNode(3)
    }
    root.right = TreeNode(7).apply {
        left = TreeNode(6)
        right = TreeNode(9)
    }

    // Traverse the binary tree and store the node values in a list

//    input root = [4,2,7,1,3,6,9]
    val solution = Solution()
    val nodeList = solution.invertTree(root)

    // Print the list of node values
    println(nodeList)
}

