import java.util.Arrays;


//Q. Find if array is sorted or not
public class recursion1 {
    public static void main(String[] args) {
        int num[]={1,2,5,6};
        System.out.println(checkSortedRecursive(num,0));

    }

    static boolean checkSortedRecursive(int []num,int ind){

        if(ind>=num.length-1) return true;
        if(num[ind]>num[ind+1]){
            return false;
        }
        else return checkSortedRecursive(num,ind+1);


    }

    static boolean checkSortedIterative(int []num){
        for (int i=0;i<num.length-1;i++){
            if(num[i]>num[i+1]){
                return false;
            }
        }

        return true;
    }
}
