package Arrays_basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class largest_element {

    public static int largest_ele(int[]arr){
        Arrays.sort(arr);
        return arr[arr.length-1];



        /* T.C : O(n logn) S.C : O(n) */
    }

    /* using recursive approach - Optimized solution */

    public static int largest_rec(int[]arr){

        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

        /* T.C : O(n) S.C : O(1) */
    }

    public static void main(String[] args) {
        int[]arr = {20,10,90,44,89};
        System.out.println("The largest element is:"+ largest_ele(arr));
        System.out.println("The largest element is:"+ largest_rec(arr));

    }
}
