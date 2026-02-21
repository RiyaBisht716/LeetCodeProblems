/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {

    //Optimal apprpoach 

    public Node copyRandomList(Node head) {
        //if node is empty
        if(head == null) return null;
        insertCopyInBetween(head);
        connectRandomPointer(head);
        return getDeepCopyList(head);
        

    }
    //Inserting  the copy node inbetween

    void insertCopyInBetween(Node head){
            Node temp = head;
            while(temp != null){
                Node copyNode = new Node(temp.val);
                copyNode.next = temp.next;
                temp.next = copyNode;
                temp = temp.next.next;

            }
    }

        // Connecting the random pointers

    void connectRandomPointer(Node head){
            Node temp =  head;
            while(temp != null){
                //initialize the copyNode
                Node copyNode = temp.next;
                if(temp.random != null){
                    copyNode.random = temp.random.next; // yeh copy node random hai
                }
                else{
                    copyNode.random = null;
                }
                temp = temp.next.next;
                
            }
     }

    Node getDeepCopyList(Node head){
            Node temp = head;
            Node dummy = new Node(-1);
            Node res = dummy;

            while(temp != null){
                res.next = temp.next;
                res = res.next;//update the res value

                //diconnecting the list
                temp.next = temp.next.next;
                temp = temp.next;

            }
            return dummy.next;
    }


        
    
}