package Arrays_Medium;

import java.util.Scanner;
public class two_sum {

    public static void twosum_brute(int[]arr, int taget){

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]+arr[j]==taget){
                    System.out.println("Found at the Index of:"+i+" "+j);
                }
            }
        }
    }

    public static void two_sum_optimized(int[]arr, int target){

        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(arr[start]+arr[end]==target){
                System.out.print("Found at the Index of:"+start+" "+end);
                break;
            }
            else if (arr[start]+arr[end]<target){
                start++;
            }
            else{
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[]arr = {2,3,4,9,6};
        int target = 10;
        //twosum_brute(arr,target);
        two_sum_optimized(arr,target);

    }
}
