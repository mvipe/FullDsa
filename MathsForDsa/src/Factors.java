import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        //System.out.println(factors(20));
        factorswithsortedorder(36);
    }

    //o(n)
    static void factors1(int num){
        //simple code for finding factors of a num
        for (int i = 1; i <=num ; i++) {
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }

    //o(sqrt(n))
    static void factors2(int num){
        //efficient code for finding factors of a num
        for (int i = 1; i <=Math.sqrt(num) ; i++) {
            if(num%i==0){
                if((num/i)==i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" "+(num/i)+" ");
                }

            }
        }
    }

    //T.C=o(sqrt(n))  S.C=o(sqrt(n))
    static void factorswithsortedorder(int num){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(num) ; i++) {
            if(num%i==0){
                if((num/i)==i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" ");
                    list.add(0,(num/i));
                }

            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
