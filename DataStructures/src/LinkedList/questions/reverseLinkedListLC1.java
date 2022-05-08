package LinkedList.questions;

import LinkedList.LL;

public class reverseLinkedListLC1 {
    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        ListNode node1=new ListNode(2);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(1);
        ListNode node4=new ListNode(1);

        ListNode temp=listNode;
        temp.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        System.out.println(isPalindrome(temp));
//        display(temp);
//        ListNode reverseList=reverseBetween(temp,4,7);
//       display(reverseList);
    }

    public static boolean isPalindrome(ListNode head) {



        return true;


    }

    static int size(ListNode head){
        ListNode temp=head;
        int s=0;

        while(temp!=null){
            s++;
            temp=temp.next;
        }

        return s;
    }


    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if( left==right){
            return head;
        }

        //skip the first left-1 nodes
        ListNode current=head;//current starts from null
        ListNode prev=null;//prev starts from head

        for (int i = 0; current!=null && i < left-1; i++) {
            prev=current;
            current=current.next;
        }

        ListNode last=prev;
        ListNode newEnd=current;

        //reverse between left and right
        ListNode next=current.next;
        for (int i = 0; current!=null && i < right-left+1; i++) {
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                    next=next.next;
            }
        }


        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }

        newEnd.next=current;

        return head;





    }






    static int getSize(ListNode head){
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        return size;
    }


    static ListNode getNode(int ind,ListNode head){

        ListNode temp=head;

        for (int i = 0; i <ind ; i++) {
            temp=temp.next;
        }

        return temp;
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
