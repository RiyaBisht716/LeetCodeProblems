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
    // ################# Brute force - ( Time complexity:-O(n+ n/2) , Space Complexity:- O(1) #################

    // public ListNode deleteMiddle(ListNode head){
    //     ListNode temp = head;
    //     int n = 0; // n is no of nodes

    //     //calculating the no of nodes in a Linked list
    //     while(temp != null){
    //         n++;
    //         temp = temp.next;
    //     }

    //     int ans = n/2;  // Calculate the index of the middle node

    //     temp = head;  // Reset the temporary node to the beginning of the linked list

    //        // Loop to find the middle node to delete

    //     while(temp != null){
    //         ans--;
    //          // If the middle node is found
    //         if(ans == 0){
    //             ListNode middle = temp.next;
    //             temp.next = temp.next.next;
    //              // Exit the loop after deleting the middle node
    //             break;
    //         }
    //         temp = temp.next;
            
    //     }
    //     return head;

    // }
    // Optimal Approach:- Time complexity ;- O(n/2) as we move only half of linkedlist ,Space complexity:- O(1)
    public ListNode deleteMiddle(ListNode head) {
        //agar sirf single node hai toh simply delete kr do
        if(head == null || head.next == null) return null;
 
        ListNode slow = head; //here we skip the slow by 1 
        ListNode fast = head;
        fast = fast.next.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
        
    }
}