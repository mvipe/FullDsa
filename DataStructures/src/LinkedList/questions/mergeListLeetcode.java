package LinkedList.questions;

public class mergeListLeetcode {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;

        ListNode res=new ListNode();

        ListNode resTemp=res;

        while(temp1!=null && temp2!=null){
            if(temp1.val> temp2.val){
                resTemp.next=temp2;
                temp2=temp2.next;
                resTemp=resTemp.next;
            }else{
                resTemp.next=temp1;
                temp1=temp1.next;
                resTemp=resTemp.next;
            }
        }

        resTemp.next=temp1!=null ? temp1 : temp2;

        return res.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
