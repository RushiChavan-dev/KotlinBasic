package bsic.leetcode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {




        var current1 = list1
        var current2 = list2

        // Create a dummy node to start the merged list
        val dummy = ListNode(0)
        var currentDummy = dummy

        while (current1 != null && current2 != null) {

            if (current1.`val` < current2.`val`) {
                currentDummy.next = current1
                current1 = current1.next
                print("Testing $dummy")
            }else {
                currentDummy.next = current2
                current2 = current2.next
                print("Rechecking $dummy")
            }
            currentDummy = currentDummy.next
        }

        if (current1 != null)  currentDummy.next = current1
        if (current2 != null) currentDummy.next = current2


        return dummy.next


    }

}


/*
* ou are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
* */