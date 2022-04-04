package StackAndQueue.Basic;

import java.util.*;

public class InBuiltExample {

    public static void main(String[] args) {
//        Stack<Integer> stack=new Stack<>();
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(10);
//        stack.push(5);
//
//        System.out.println(stack.get(2));
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());

//        Queue<Integer> queue=new LinkedList();
//        queue.add(20);
//        queue.add(30);
//        queue.add(40);
//
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());

        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.removeFirst();

    }
}
