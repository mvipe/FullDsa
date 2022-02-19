public class main {
    public static void main(String[] args) {
        int a=7;
        int b=0;

        try{
            divide(a,b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }

    static void divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please dont divide by zero");
        }
        System.out.println(a/b);
    }
}
