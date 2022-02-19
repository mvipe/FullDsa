import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[] temp=new int[2*data.length];

        //copy the current items in the new array
        for (int i=0;i<data.length;i++){
            temp[i]=data[i];
        }

        data=temp;

    }

    public int remove(){
        int removed=data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index]=value;
    }
    private boolean isFull() {
        return size==data.length;
    }


    @Override
    public String toString() {
        return "Custom Array List{"+ Arrays.toString(data) +'}';
    }
    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
        System.out.println(list.size());

        list.add(20);
        list.add(40);
        list.add(24);
        list.add(21);
        System.out.println(list.toString());

        System.out.println(list.size());
    }


 }
