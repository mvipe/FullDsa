import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public CustomGenericArrayList(){
        this.data=new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[] temp=new Object[2*data.length];

        //copy the current items in the new array
        for (int i=0;i<data.length;i++){
            temp[i]=data[i];
        }

        data=temp;

    }

    public T remove(){
        T removed=(T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index,T value){
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
        CustomGenericArrayList<String> list=new CustomGenericArrayList<>();
        System.out.println(list.size());

        list.add("way");
        list.add("to");
        list.add("hell");

        System.out.println(list.toString());

        System.out.println(list.size());
    }


 }
