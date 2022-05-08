package LinkedList.questions;

public class isPalindrome {
    public static void main(String[] args) {

    }

    public static void reorderList(ListNode head) {

        if(head==null || head.next==null) return;

        //find the middle node
        ListNode mid=middleNode(head);

        ListNode hs=reverseList(mid);//hs stands for headSecond
        ListNode hf=head;

        //rearrange
        while(hf!=null && hs!=null){
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }


        //next of tail to null
        if(hf!=null){
            hf.next=null;
        }

    }

    public static boolean isPalindrome(ListNode head) {
        ListNode tempHead=head;

        //get Middle Node
        ListNode mid=middleNode(tempHead);

        //reverse second half
        ListNode headSecond=reverseList(mid);
        ListNode reverseHead=headSecond; // we will use this head to rereverse it


        //compare both the half
        while(head!=null && headSecond!=null){
            if(head.val!=headSecond.val){
                break;//means it is not palindrome
            }

            head=head.next;
            headSecond=headSecond.next;
        }




        //at the end just re reverse it
        reverseList(reverseHead);

        //check is  break condition applied or not
        if(head==null || headSecond==null) return true;
        return false;

    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }


    public static ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }

        return slow;
    }
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

}
