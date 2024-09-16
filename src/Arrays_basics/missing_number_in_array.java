package Arrays_basics;

public class missing_number_in_array {

    public static int missing_number_arr1(int n, int[]arr){

        int sum = n*(n+1)/2;
        int val=0;
        for(int i=0;i<arr.length;i++){
            val+=arr[i];
        }
        return sum-val;

        /**
         * T.C : O(n)
         * S.C: O(1)
         * **/
    }

    public static int missing_number_arr2(int n, int[]arr){
        int xor_1= 0;
        int xor_2= 0;

        for(int i=0;i<n-1;i++){
            xor_2 = xor_2^arr[i];
            xor_1 = xor_1^(i+1);
        }
        xor_1 = xor_1^n;

        return (xor_1^xor_2);
    }

    public static void main(String[] args) {
        int n = 5;
        int[]arr = {1,2,4,5};

        int ans = missing_number_arr1(n,arr);
        System.out.println("The Missing number is:"+ missing_number_arr1(n,arr));

        int ans_1 = missing_number_arr2(n,arr);
        System.out.println("The Missing number is:"+ missing_number_arr2(n,arr));
    }
}
