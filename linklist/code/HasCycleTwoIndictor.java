package linklist.code;

public class HasCycleTwoIndictor {
    public boolean hasCycle(ListNode head){
        if(head == null || head.next == null)   return false; ///空链表无环，单个节点也无环
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
