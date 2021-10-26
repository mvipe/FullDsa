package questions;
//string questions
public class Question1 {
    public static void main(String[] args) {
        String s= "bbacad";
        System.out.println(skip(0,s,'b',""));
        System.out.println(s);

    }

    static String skip(int ind,String s, char del,String ans){
        if(ind>=s.length()){
            return ans;
        }

        if(s.charAt(ind)==del){

            return skip(ind+1,s,del,ans);

        }else{
            ans=ans+s.charAt(ind);
            return skip(ind+1,s,del,ans);
        }
    }

    static String skip(int ind,String s,char del){
        //less efficient
        if(ind>=s.length()){
            return s;
        }
        if(s.charAt(ind)==del){
            String left=s.substring(0,ind);
            String right=s.substring(ind+1);

            s=left+right;
            return skip(ind,s,del);

        }else{
            return skip(ind+1,s,del);
        }

    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
