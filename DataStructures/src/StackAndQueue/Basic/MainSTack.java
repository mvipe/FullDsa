package StackAndQueue.Basic;

public class MainSTack {
    public static void main(String[] args) throws Exception {
        CustomStack stack=new CustomStack(4);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.peek());
    }
}
