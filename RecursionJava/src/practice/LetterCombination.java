package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/
public class LetterCombination {


    public static String[] comb={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list=LetterCombination("","");

        for(String s:list){
            System.out.println(s);
        }
    }

    static List<String> LetterCombination(String p, String up){
        if(up.isEmpty()){

            List<String> list=new ArrayList<>();
            if(p.equals("")) return list;
            list.add(p);
            return  list;
        }

        String ch= String.valueOf(up.charAt(0));

        List<String> ans=new ArrayList<>();

        String numToLetters=comb[Integer.valueOf(ch)-2];
        for(int i=0;i<numToLetters.length();i++){

             ans.addAll(LetterCombination(p+numToLetters.charAt(i),up.substring(1)));


        }
        return ans;
    }


}
