package LinkedList.questions;

import LinkedList.LL;
import LinkedList.LL.Node;



public class mergeList {
    public static void main(String[] args) {
        LL list1=new LL();
        list1.insert(4,0);
        list1.insert(2,0);
        list1.insert(1,0);

        LL list2=new LL();
        list2.insert(4,0);
        list2.insert(3,0);
        list2.insert(1,0);

        LL mergeList= mergelist(list1,list2);
        mergeList.display();


    }

    private static LL mergelist(LL list1, LL list2) {
        Node temp1=list1.head;
        Node temp2=list2.head;

        LL res=new LL();

        while(temp1!=null && temp2!=null){
            if(temp1.getValue()>=temp2.getValue()){
                res.insertLast(temp2.getValue());
                temp2=temp2.next;
            }else{
                res.insertLast(temp1.getValue());
                temp1=temp1.next;
            }
        }

        while(temp1!=null){
            res.insertLast(temp1.getValue());
            temp1=temp1.next;
        }

        while(temp2!=null){
            res.insertLast(temp2.getValue());
            temp2=temp2.next;
        }

        return res;

    }
}
