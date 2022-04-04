package StackAndQueue.Basic;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue=new CustomQueue(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        System.out.println(queue.front());
        System.out.println(queue.remove());
        System.out.println(queue.front());
    }


}
