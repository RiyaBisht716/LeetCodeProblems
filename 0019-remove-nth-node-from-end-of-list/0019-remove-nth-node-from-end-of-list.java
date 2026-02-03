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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        //slow pointer jis node ko delete krn hai uske previous node tk jayega
        for(int i=0;i<n;i++) fast = fast.next;
        //yeh jab n = length of linked ho toh first node he hoga jisko hum delete kr rhe hai
        if(fast == null) return head.next;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode delNode = slow.next;
        slow.next = slow.next.next;

        return head;
        
    }
}