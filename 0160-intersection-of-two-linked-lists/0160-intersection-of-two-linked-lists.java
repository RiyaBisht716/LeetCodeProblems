/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // Finding intersection using set 
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        Set<ListNode> set = new HashSet<>();
        //Yaha hum A linked list ke node daal rge hai 
        while(headA != null){
            set.add(headA);
            headA = headA.next;

        }
        //ismain hum check kr rhe hai kya headB ka koe node toh nhi common hai toh return kr do uusi time 
        while(headB != null){
            if(set.contains(headB)) return headB;
            headB = headB.next;
        }
        return null;// agar koe bhi intersection nhi hai toh return kr do null
    }
}