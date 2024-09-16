package Arrays_basics;

import java.util.*;
public class Remove_duplicates {

    public static void remove_dup(int[]arr){


        //Brute-Force approach

//        Time complexity: O(n*log(n))+O(n)
//
//        Space Complexity: O(n)


        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int j: set){
            System.out.print(j+" ");
        }
    }

    public static int remove_dup_1(int[]arr){
        // Optimized solution
        // Time complexity: O(n)

//        Space Complexity: O(1)


        int i=0;
        for(int j=1;j<arr.length;j++){

            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;



    }

    public static void main(String[] args) {

        int[]arr = {1,1,1,2,2,3,3,3,3,4,4};
        remove_dup(arr);
        System.out.println();
        int k = remove_dup_1(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
