package LinkedList;
public class LL {

    public Node head;
    public Node tail;
    public int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    //insert using recursion

    public void insertUsingRecursion(int val, int index){
        head=insertUsingRec(val,index,head);
        if(tail==null){
            tail=head;
        }
    }
    private Node insertUsingRec(int val, int index,Node befNode){

        if(index==0){
            Node newNod=new Node(val);
            newNod.next=befNode;
            size++;
            return newNod;
        }


        befNode.next=insertUsingRec(val,index-1,befNode.next);

        return befNode;



    }


    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    //reversive linked list using recursion
    public void reverseRecursive(Node node){
        if(node==tail){
            head=tail;
            return;
        }

        reverseRecursive(node.next);

        tail.next=node;
        tail=node;
        tail.next=null;
    }

    //iterative approach to reverse linked list
    //inplace reversal
    public void reverse(){
        if(size<2){
            return;
        }

        Node prev=null;
        Node present=head;
        Node next=present.next;

        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }

        head=prev;
    }

    public class Node {
        private int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


}