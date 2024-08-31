package Basics;

public class fibonocii_series {

    public static void fibonocci_numbers(int n){
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" "+n2+" ");

        for(int i=2;i<=n;i++){
            int n3 = n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;

        }
    }

    public static int nth_fib(int num){

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        for(int i = 2;i<num;i++){
            n3 = n1+n2;
            n1=n2;
            n2=n3;

        }
        return n3;
    }

    public static void main(String[] args) {
        int n = 10;
        //print 1st 10 fibonocci series..
        fibonocci_numbers(n);

        System.out.println();

        //print nth fibonocci number...
        System.out.println("the n th fibonocci  number is:"+ nth_fib(10));


    }
}
