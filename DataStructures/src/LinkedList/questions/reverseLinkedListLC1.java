package LinkedList.questions;

import LinkedList.LL;

public class reverseLinkedListLC1 {
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
        ListNode reverseList=reverse2(temp);
       display(reverseList);
    }

    static ListNode reverse2(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=head.next;

        while(next!=null){

            ListNode newPrev=pres;
            ListNode newPres=pres.next;

            next=next.next;



            pres.next=prev;

            prev=newPrev;
            pres=newPres;

        }

        pres.next=prev;



        return pres;
    }
//    static ListNode recursiveReverse(ListNode head){
//        if()
//    }

    static ListNode reverse(ListNode head){

        int size=getSize(head);
        if(size==0 || size==1){
            return head;
        }

        ListNode tempHead=head;


        ListNode s=head;
        ListNode e=getNode(size-1,head);

        //first swap
        ListNode prev=getNode(size-2,head);
        prev.next=s;
        e.next=s.next;
        s.next=null;

        tempHead=e;

        s=tempHead.next;
        e= prev;

        int sInd=1;
        int eInd=size-2;

        while (sInd<eInd) {

            //case-1 : when start and end is adjacent
            if(eInd-sInd==1) {
                s.next = e.next;
                e.next = s;

                ListNode prevNode=getNode(sInd-1,tempHead);
                prevNode.next=e;
                sInd++;
                eInd--;

                s=getNode(sInd,tempHead);
                e=getNode(eInd,tempHead);

            }else{
                ListNode prevStart=getNode(sInd-1,tempHead);
                ListNode prevEnd=getNode(eInd-1,tempHead);

                ListNode tempStart=s.next;

                prevStart.next=e;
                s.next=e.next;
                prevEnd.next=s;
                e.next=tempStart;

                sInd++;
                eInd--;

                s=getNode(sInd,tempHead);
                e=getNode(eInd,tempHead);

            }


        }

        return tempHead;
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
