package Arrays_basics;
import java.util.*;

public class check_array_sorted {

    public static int check_sorted_0(int[]arr){
        for(int i=0;i<arr.length;i++){
            for( int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    return 0;
                }
            }

        }
        return 1;
    }

    public  static boolean check_sorted(int[]arr){

        /** optimized code
         * T.C: o(n)
         * S.C: o(1)
         * **/
        boolean res = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                res= false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[]arr = {10,20,30,40,50};
        boolean ans =  check_sorted(arr);
        if(ans){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

        /* for brute force */
        int val = check_sorted_0(arr);
        if(val==0){
            System.out.println("Array is not sorted");
        }
        else{
            System.out.println("Array is sorted");
        }
    }
}
