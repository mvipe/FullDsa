package LinkedList.questions;

import LinkedList.LL;
import LinkedList.LL.Node;

public class reverseLinkedList {
    public static void main(String[] args) {
        LL list=new LL();
        list.insert(2,0);
        list.insert(8,0);
        list.insert(31,0);
        list.insert(12,0);
        list.insert(34,0);
        list.insert(17,0);
        list.insert(19,0);




        list.display();
        LL reverseList=reverse(list);
        reverseList.display();
    }

    static LL reverse(LL list){
        Node head=list.head;
        Node tail=list.tail;

        if(list.size==0 || list.size==1){
            return list;
        }

        Node s=head;
        Node e=tail;
        //for first swap

        Node prev=list.get(list.size-2);
        prev.next=s;
        e.next=s.next;
        s.next=null;

        list.head=e;
        list.tail=s;

        //increase starting Node and decreasing ending Node
        s=list.head.next;
        e= prev;



        int sInd=1;
        int eInd=list.size-2;

        while (sInd<eInd){
            //case-1 : when start and end is adjacent
            if(eInd-sInd==1){
                s.next=e.next;
                e.next=s;
                Node prevNode=list.get(sInd-1);
                prevNode.next=e;
                sInd++;
                eInd--;

                s=list.get(sInd);
                e=list.get(eInd);
            }

            //case-2:
            else{
                Node prevStart=list.get(sInd-1);
                Node prevEnd=list.get(eInd-1);

                Node tempStart=s.next;

                prevStart.next=e;
                s.next=e.next;
                prevEnd.next=s;
                e.next=tempStart;

                sInd++;
                eInd--;

                s=list.get(sInd);
                e=list.get(eInd);

            }

        }

        return list;

    }


}
