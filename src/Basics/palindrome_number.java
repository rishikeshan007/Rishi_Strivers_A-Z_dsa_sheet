package Basics;

public class palindrome_number {

    public static int palindrome(int n){

        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans=ans*10+rem;
            n/=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 121;
        int ans = palindrome(n);
        System.out.println(ans);
        if(n==ans){
            System.out.println(n+" is a palindrome number");
        }
        else{
            System.out.println(n+" is not a palindrome number");
        }
    }
}
