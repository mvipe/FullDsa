package LinkedList.questions;

public class removeDuplicates {
    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);


        ListNode temp=listNode;
        temp.next=node1;
        node1.next=node2;

        display(listNode);
        deleteDuplicates(listNode);
        display(listNode);





    }

    public static void display(ListNode head){
        while(head!=null){
            System.out.print(head.val + " -> ");
            head=head.next;
        }

        System.out.println("END");
    }

    //iterative approach
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead=head;
        ListNode temp=head;

        if(temp==null){
            return temp;
        }

        while(temp.next!=null && temp!=null){
            if(temp.next.val== temp.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }

        }


        return dummyHead;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
