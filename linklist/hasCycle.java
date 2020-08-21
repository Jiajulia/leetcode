package linklist;
//141. 环形链表

import java.rmi.UnexpectedException;
import java.util.HashSet;
import java.util.LinkedList;
import linklist.ListNode;

//Definition for singly-linked list.

public class hasCycle {
    public boolean cycle(ListNode head){
        HashSet nodeSet = new HashSet();
        while(head != null){
            if (nodeSet.contains(head)) return true;
            nodeSet.add(head);
            head = head.next;
        }
        return false;
    }
}
