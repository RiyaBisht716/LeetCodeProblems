/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    // function to detect loop in linked list
    //detect loop using hashmap - TC- O(N* logN), SC:- N
    // public boolean detectLoopBrute(ListNode head) {
    //     // Initialize a pointer 'temp'
    //     // at the head of the linked list
    //     ListNode temp = head;

    //     // Create a map to keep track of
    //     // encountered nodes
    //     HashMap<ListNode, Integer> nodeMap = new HashMap<>();

    //     // Step 2: Traverse the linked list
    //     while (temp != null) {
    //         // If the node is already in the
    //         // map, there is a loop
    //         if (nodeMap.containsKey(temp)) {
    //             return true;
    //         }
    //         // Store the current node
    //         // in the map
    //         nodeMap.put(temp, 1);

    //         // Move to the next node
    //         temp = temp.next;
    //     }

    //     // Step 3: If the list is successfully traversed 
    //     // without a loop, return false
    //     return false;
    // }

    //Detect cycle in a Linked list using tortoise and hare algorithm 
    //############## Optimal approach:-  TC-(O(N)) , SC :- (O(1))###############
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                return true;// agar loop detect hoga toh dono pointer ek jagaha meet karenge
            }
        }
        return false;// agar loop nhi hai 
        
    }
}