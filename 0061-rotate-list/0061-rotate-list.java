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
   // Time Complexity :- O(2n), Space Complexity:- O(1)
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        ListNode tail = head;
        int len = 1;//find the length of linked list

        while(tail.next != null){
            tail = tail.next;
            len++;
        }

        if(k % len == 0) return head; // if k is multiple of length of LL it will be same after rotation
        k = k % len; // to handle large k value

        tail.next = head;
        ListNode newNode = getKthNode(head, len-k);
        head = newNode.next;// update the new head;
        newNode.next = null;

        return head;
        
    }
    //it will count the kth Node
    private static ListNode getKthNode(ListNode temp, int k){
        int cnt = 1;
        while(temp != null){
            if(cnt == k) return temp;
            temp = temp.next;
            cnt++;
        }
        return temp;
    }
}