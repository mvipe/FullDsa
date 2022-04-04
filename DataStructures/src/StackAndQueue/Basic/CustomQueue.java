package StackAndQueue.Basic;

public class CustomQueue {
    protected int[] data;
    public static final int DEFAULT_SIZE=10;

    int end=0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        data=new int[size];
    }

    public boolean isFull(){
        return end==data.length-1;
    }

    public boolean isEmpty(){
        return end==0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end++]=item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Cant Remove From An Empty Queue");
        }

        int removed =data[0];

        //shift elements to left
        for (int i = 1; i <end ; i++) {
            data[i-1]=data[i];
        }

        end--;

        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        return data[0];
    }
}
