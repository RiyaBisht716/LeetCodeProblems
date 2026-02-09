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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){
            ListNode kthNode = getKthNode(temp,k);

            if(kthNode == null){
                if(prev != null) prev.next = temp;
                break;
            }
            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            reverseKth(temp);

            if(head == temp) head = kthNode;
            else{
                prev.next = kthNode;
            }
            prev = temp;
            temp = nextNode;

        }
        return head;
    }

    static ListNode getKthNode(ListNode temp, int k){
        k -= 1;
        while(temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;

    }
    static ListNode reverseKth(ListNode temp){
        if(temp == null || temp.next == null) return temp;
        ListNode back = null;
        ListNode curr = temp;

        while(curr != null){
            ListNode front = curr.next;
            curr.next = back;
            back = curr;
            curr = front;
        }
        return back;
    }
}