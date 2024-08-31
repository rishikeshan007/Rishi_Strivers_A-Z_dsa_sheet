package Basics;

public class prime_number {


    /* Brute force */
    public static boolean isprime(int n){
        int count = 0;
        if(n==0 || n==1){
            return true;
        }
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }

    /* Optimal solution */

    public static boolean isprime2(int n){
        int cnt = 0;
        if(n==0 || n==1){
            return true;
        }
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n % i == 0){

                // Increment the counter.
                cnt = cnt + 1;

                // If n is not a perfect square,
                // count its reciprocal factor.
                if(n / i != i){
                    cnt = cnt + 1;
                }
            }
        }
        if(cnt==2){
            return true;
        }
        return false;


    }

    public static void main(String[] args) {
        int n = 13;
        if(isprime2(n)){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }

    }

}

