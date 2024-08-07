package ozomahtli;

import java.util.HashMap;


public class LinkedListCycle {
    //tests here
    public static void main(String[] args){


    }
    public boolean hasCycle1(ListNode head) {
        ListNode t = head;
        int c = 0;
        HashMap<ListNode, String> hm = new HashMap<>();
        if(head == null){return false;}
        while(t.next != null){
            t = t.next;
            if(!hm.containsKey(t)){
                hm.put(t,"");
            }
            else if(hm.containsKey(t)){
                return true;
            }
        }

        return false;
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }

        return false;
    }

}
