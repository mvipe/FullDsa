import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(8);

        //arrayList.forEach((item)-> System.out.println(item*2));

        //Consumer Interface
        Consumer<Integer> fun=(item)->System.out.println(item*2);
        arrayList.forEach(fun);
    }
}
