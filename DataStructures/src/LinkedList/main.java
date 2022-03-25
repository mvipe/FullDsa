package LinkedList;

public class main {
    public static void main(String[] args) {

        LL list=new LL();
        list.insert(2,0);
        list.insert(8,0);
        list.insert(31,0);
        list.insert(12,0);
        list.insert(22,0);
        list.insert(67,0);


        list.display();
        list.insertUsingRecursion(222,2);
        list.insertUsingRecursion(332,0);
        list.insertUsingRecursion(332,8);
        list.display();


//    DLL list=new DLL();
//        list.insertFirst(27);
//        list.insertFirst(37);
//        list.insertLast(38);
//        list.insert(44,2);
//       list.delete(0);
//        System.out.println(list.getSize());
//        list.display();
//        list.ReverseTraversal();

    }
}
