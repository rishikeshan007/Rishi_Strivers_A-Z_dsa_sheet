package Basics;

public class count_digits {

    public static int count_digits_num(int n){
         int res = 0;
         while(n>0){
             n =  n%10;
             res++;
             n/=10;
         }
         return res;

    }

    public static void main(String[]args){
        int n = 100000;
        System.out.println("The count of digits is"+" "+count_digits_num(n));

    }
}
