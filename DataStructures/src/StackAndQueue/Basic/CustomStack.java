package StackAndQueue.Basic;

public class CustomStack {
    protected int[] data;
    public static final int DEFAULT_SIZE=10;

    int ptr=-1;

    public CustomStack(){
        //this will call second constructor with defaultsize as parameter
        this(DEFAULT_SIZE);

    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr]=item;

        return true;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Can Not Pop From An Empty Stack");
        }
        ptr--;
        return data[ptr+1];
    }

    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Can Not Peek From An Empty Stack");
        }

        return data[ptr];
    }

    public boolean isFull() {
       return ptr==data.length-1;
       //ptr is at last index
    }

    public boolean isEmpty() {
        return ptr==-1;

    }
}
