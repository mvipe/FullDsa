package LinkedList.questions;

public class ReverseNodesInKGroups {
    public static void main(String[] args) {

    }


    public static   ListNode reverseKGroup(ListNode head, int k) {

        //new code begain
        if(k<=1 || head==null || head.next==null) return head ;

        ListNode curr=head;
        ListNode prev=null;

        while(true){
            ListNode last=prev ;
            ListNode newEnd=curr;

            ListNode next=curr.next;

            //check for is that next element length>=k
            ListNode temp=curr;
            for (int i = 0; temp!=null && i < k-1; i++) {

                temp=temp.next;

            }

            if(temp==null){
                break;
            }



            for (int i = 0; curr!=null && i < k; i++) {
                curr.next=prev;
                prev=curr;
                curr=next;

                if(next!=null){
                    next=next.next;
                }
            }

            if(last!=null){
                last.next=prev;

            }else{
                head=prev;
            }

            newEnd.next=curr;

            if(curr==null){
                break;
            }

            prev=newEnd;

        }

        return head;


    }

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

}
