/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next; // move slow pointer one step ahead
            fast = fast.next.next; // move fast pointer two step ahead

        }

        ListNode newHead = reverseList(slow.next);//reverse the second half of linked list
        ListNode first = head;
        ListNode second = newHead;

        while(second != null){
            if(first.val != second.val ){
                //reverse back to original
                reverseList(newHead);
                return false;
            }
            first = first.next;
            second = second.next;

        }

        reverseList(newHead);
        return true;


        
    }
    private ListNode reverseList(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);

        ListNode front = head.next;
        front.next = head;
        head.next =null;

        return newHead;
    }
}