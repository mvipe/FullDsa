import java.util.Arrays;

//https://www.javatpoint.com/shallow-copy-java

public class main  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human rahul=new Human(20,"rahul");
        //Human twin=new Human(rahul);
        //here the problem is that it takes lots of processing time because we used new keyboard here
        //thats why we will used an interface cloneable for object clone

        Human twin=(Human) rahul.clone();
        System.out.println("age"+twin.age);



        twin.arr[0]=55;
        twin.age=99;

        System.out.println(Arrays.toString(rahul.arr));
        System.out.println(rahul.age);


    }


}
