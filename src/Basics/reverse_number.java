package Basics;

public class reverse_number {

    public static int reverse(int n){
        int ans = 0;

        while(n>0){
            int rem = n%10;
            ans = ans*10+rem;
            n/=10;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("The reversed number is:"+" "+reverse(n));
    }
}
