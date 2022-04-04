package LinkedList.questions;

public class mergeSort {
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
        node3.next=node4;

        ListNode res=sortList(temp);


    }




    public static ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }


        ListNode mid=middleNode(head);

        ListNode left=sortList(head);
        ListNode right=sortList(mid);

        return merge(left,right);
    }

    static ListNode merge(ListNode list1, ListNode list2) {

        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    public static  ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }

        return slow;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
