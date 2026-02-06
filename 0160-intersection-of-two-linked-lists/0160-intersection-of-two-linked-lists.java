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
    // ################# Better approach :- TC[(m+n)], SC - [n] #####################
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
    //     Set<ListNode> set = new HashSet<>();
    //     //Yaha hum A linked list ke node daal rge hai 
    //     while(headA != null){
    //         set.add(headA);
    //         headA = headA.next;

    //     }
    //     //ismain hum check kr rhe hai kya headB ka koe node toh nhi common hai toh return kr do uusi time 
    //     while(headB != null){
    //         if(set.contains(headB)) return headB;
    //         headB = headB.next;
    //     }
    //     return null;// agar koe bhi intersection nhi hai toh return kr do null
    // }

    public ListNode getIntersectionNode(ListNode headA , ListNode headB){
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != temp2){
            temp1 = temp1 == null ? headB : temp1.next;//jese he temp1 null pr hoga toh woh dusre temp ke head pr chla jayega
            temp2 = temp2 == null ? headA : temp2.next;
        }
        return temp1;
    }
}

