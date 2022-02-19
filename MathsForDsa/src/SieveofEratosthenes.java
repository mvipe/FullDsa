public class SieveofEratosthenes {
    //checking the number is prime or not between 2-40
    public static void main(String[] args) {
        int n=40;
        boolean[] primes=new boolean[n+1];

        sieve(n,primes);

    }

    static void sieve(int n , boolean primes[]){
        for (int i = 2; i*i <= n; i++) {
            if (!primes[i]) {
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }

        //print
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
