import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Student raj=new Student(20,77);
        Student gag=new Student(2,79);

        if(raj.compareTo(gag)>0){
            System.out.println("raj has more marks");
        }

        Student[] list={raj,gag};


        Arrays.sort(list);

        //lambda function
        Arrays.sort(list,((o1, o2) -> (int) o1.marks- o2.marks));

    }
}
