package LinkedList.questions;

public class reverseRecursive {
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
        display(temp);
        reverse(temp,findTail(temp));
        display(temp);
    }

//    static ListNode reverseBetween(ListNode head, int left, int right) {
//
//        if(left==right) return head;
//    }

    static ListNode findTail(ListNode head){
        while(head.next!=null){
            head=head.next;
        }

        return head;
    }

    static void reverse(ListNode head,ListNode tail){
        if(head==tail){

            return;
        }

        reverse(head.next,tail);
        tail.next=head;
        tail=head;
        tail.next=null;





    }

    static void display(ListNode head){
        while(head!=null){
            System.out.print(head.val+"->");
            head=head.next;
        }
        System.out.println("END");
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
