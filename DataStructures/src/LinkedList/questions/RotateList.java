package LinkedList.questions;

public class RotateList {
    public static void main(String[] args) {

    }


    //2nd approach - this is more optimized
    public ListNode rotateRight2(ListNode head, int k) {
        if(k==0 || head==null || head.next==null){
            return head;
        }

        int size=size(head);
        k=k%size;

        if(k==0) return head;
        ListNode prev=null;
        ListNode curr=head;

        //run the loop size-k times
        for (int i = 0;curr!=null && i < size-k; i++) {
            prev=curr;
            curr=curr.next;
        }

        ListNode last=curr;
        while(last!=null &&last.next!=null){
            last=last.next;
        }



        last.next=head;
        head=prev.next;
        prev.next=null;

        return head;






    }


    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        k=k%size(head);
        ListNode newHead=head;
        ListNode temp=head;

        for (int i = 0; i < k; i++) {
            ListNode prev=null;
            ListNode curr=newHead;
            while(curr.next!=null){
                prev=curr;
                curr=curr.next;
            }

            prev.next=null;
            curr.next=newHead;
            newHead=curr;

        }

        return newHead;
    }

    public int size(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }

        return count;
    }


    public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
