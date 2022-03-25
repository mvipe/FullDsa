package LinkedList.questions;

public class isHappy {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    static boolean isHappy(int n){
        int slow=n;
        int fast=n;
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }
        while(slow!=fast);

        if(slow==1){
            return true;
        }

        return false;
    }

    private static int findSquare(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans+=rem*rem;
        }

        return ans;
    }
}
