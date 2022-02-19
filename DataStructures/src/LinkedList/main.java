package LinkedList;

public class main {
    public static void main(String[] args) {

    DLL list=new DLL();
        list.insertFirst(27);
        list.insertFirst(37);
        list.insertLast(38);
        list.insert(44,2);
       list.delete(0);
        System.out.println(list.getSize());
        list.display();
        list.ReverseTraversal();

    }
}
