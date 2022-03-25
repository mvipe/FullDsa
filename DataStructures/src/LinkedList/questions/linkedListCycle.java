package LinkedList.questions;

public class linkedListCycle {
    public static void main(String[] args) {
        ListNode listNode=new ListNode(3);
        ListNode node1=new ListNode(4);
        ListNode node2=new ListNode(9);
        ListNode node3=new ListNode(7);
        ListNode node4=new ListNode(6);

        ListNode temp=listNode;
        temp.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node1;


//        System.out.println(hasCycle(temp));
        //System.out.println(detectCycle(temp).val);
        System.out.println(cycleLength(temp));





    }

    // https://leetcode.com/problems/linked-list-cycle-ii/
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = cycleLength(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // find the start node
        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    static int cycleLength(ListNode head){
        if( head==null ){
            return 0;
        }
        ListNode slowPointer=head;
        ListNode fastPointer=head;

        ListNode meetPointer=null;
        int length=0;

        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
            if(slowPointer.equals(fastPointer)){
                meetPointer=slowPointer;
                slowPointer=slowPointer.next;
                length++;
                break;
            }
        }

        //calculate the length
        while(slowPointer!=null && !slowPointer.equals(meetPointer)){
            slowPointer=slowPointer.next;
            length++;
        }

        return length;
    }

    public static boolean hasCycle(ListNode head) {


        if( head==null ){
            return false;
        }
        ListNode slowPointer=head;
        ListNode fastPointer=head;

        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
            if(slowPointer.equals(fastPointer)){
                return true;
            }
        }

        return false;

    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
