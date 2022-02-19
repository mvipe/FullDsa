public class PrimeNo {
    public static void main(String[] args) {
        //checking for prime no between 1-100
        for(int i=2;i<=40;i++){
            if(isPrimeEfficient(i)){
                System.out.print(i+" ");
            }
        }
    }

    //simple function for finding any no is prime or not
    static boolean isPrime(int num){
        if(num<=1) return false;

        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    //more efficient program for finding any no is prime or not
    static boolean isPrimeEfficient(int num){

        if(num<=1) return false;

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
