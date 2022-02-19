package LinkedList;

public class DLL {
    private DoublyNode head;
    private DoublyNode tail;
    private int size;

    public DLL(){
        this.size=0;
    }

    public int getSize(){
        return size;
    }

    public void deleteFirst(){
        if(head==null){
            return;
        }

        if(size==1){
            head=null;
            tail=null;
            return;
        }

        head=head.next;
        head.prev=null;

        size--;

    }

    public void deleteLast(){
        if(tail==null){
            return;
        }
        if(size==1){
            head=null;
            tail=null;
            return;
        }

        tail=tail.prev;
        tail.next=null;

        size--;

    }

    public void delete(int index){
        if(index==0){
            deleteFirst();
            return;
        }

        if(index==size){
            deleteLast();
            return;
        }

        //finding the temp
        DoublyNode temp=head;
        for (int i = 0; i < index-1; i++) {
            temp=temp.next;
        }

        temp.next.next.prev=temp;
        temp.next=temp.next.next;

        size--;


    }

    public void insertFirst(int value){
        DoublyNode node=new DoublyNode(value);
        node.next=head;
        if(head!=null){
            head.prev=node;
        }
        this.head=node;

        if(tail==null){
            this.tail=head;
        }
        size+=1;

    }

    public void insertLast(int value){
        DoublyNode node=new DoublyNode(value);
        node.prev=tail;
        if(tail!=null){
            tail.next=node;
            tail=node;
        }else{
            tail=node;
            head=node;
        }

        size++;
    }

    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }

        if(index==size){
            insertLast(value);
            return;
        }

        //finding the temp
        DoublyNode temp=head;
        for (int i = 0; i < index-1; i++) {
            temp=temp.next;
        }


        DoublyNode node=new DoublyNode(value);
        node.prev=temp;
        node.next=temp.next;
        temp.next.prev=node;
        temp.next=node;

        size++;
    }

    public void display(){
        DoublyNode temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void ReverseTraversal(){
        DoublyNode temp=tail;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.prev;
        }
        System.out.println("Start");
    }



    private class DoublyNode {
        private int value;
        private DoublyNode prev;
        private DoublyNode next;

        public DoublyNode(int value) {
            this.value = value;
        }

        public DoublyNode(int value, DoublyNode next,DoublyNode prev) {
            this.value = value;
            this.next = next;
            this.prev=prev;
        }
    }
}
