package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class DiceQuestion {

    public static void main(String[] args) {
        Dice(new ArrayList<Integer>(),4);
    }

    static void Dice(ArrayList<Integer> p, int up){
        if(up==0){
            for(int it:p){
                System.out.print(it);

            }
            System.out.println();
        }
        for(int i=1;i<=6;i++){
            if(i<=up){
               ArrayList<Integer> temp=new ArrayList<>();
               temp.addAll(p);
               temp.add(i);

                Dice(temp,up-i);
                temp.removeAll(temp);
            }

        }

    }
}
