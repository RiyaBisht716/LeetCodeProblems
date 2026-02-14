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
    public ListNode mergeKLists(ListNode[] lists) {
        //agar list he empty hai
        if(lists.length == 0) return null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val - b.val);

        //first node insert kro
        for(ListNode node : lists){
            if(node != null){
                pq.add(node);
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(!pq.isEmpty()){
            ListNode minNode = pq.poll();// remove and return small element from pq

            temp.next = minNode;
            temp = temp.next;

            if(minNode.next != null){
                pq.add(minNode.next);
            }

        }
        return dummy.next;
        
    }
}