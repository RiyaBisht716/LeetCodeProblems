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
    // **************Brute approach-(TC:- O(N), SC:- O(1))*************
    //   public ListNode reverseList(ListNode head){
    //     Stack<Integer> st  = new Stack<>();
    //     ListNode temp = head;
    //     //push the element from node to stack

    //     while(temp != null){
    //         st.push(temp.val);
    //         temp = temp.next;
    //     }

    //     //pop the element and now it will be reverse as it is LIFO(Last in fast out)

    //     temp = head;
    //     while(temp != null){
    //         temp.val = st.pop();
    //         temp = temp.next;
    //     }
    //     return head;


    // }
    //###########(Optimal:- TC:- O(N), SC:- O(1)) #########
    // public ListNode reverseList(ListNode head) {
    //     ListNode temp = head;
    //     ListNode prev = null;
    //     while(temp != null){
    //         ListNode front = temp.next;
    //         temp.next = prev;
    //         prev = temp;
    //         temp = front;
    //     }
    //     return prev;
        
    // }
    public ListNode reverseList(ListNode head) {
        //Base case 
        if(head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }
  
}