package ozomahtli;

import java.util.HashMap;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode n = head;

        HashMap<Integer,ListNode> map = new HashMap<>();
        ListNode t = null;
        ListNode pointer = null;
        while(n != null){

            if(!map.containsKey(n.val)){
                if(t == null){
                    ListNode no = new ListNode(n.val);
                    t = no;
                    pointer = no;
                }
                else{
                    pointer.next = new ListNode(n.val);
                    pointer = pointer.next;
                }
                map.put(n.val,n);
            }

            n = n.next;

        }
        return t;
    }
}



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
