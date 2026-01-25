/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       node.val = node.next.val; //we copy the next node value
       node.next = node.next.next; //skip the next node

        
    }
}