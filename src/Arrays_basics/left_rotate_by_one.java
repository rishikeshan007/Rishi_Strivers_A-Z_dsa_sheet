package Arrays_basics;

import java.util.*;
public class left_rotate_by_one {

    public static void rotate_one(int[]arr){
        int res = arr[0];
        for(int i=0;i<=arr.length-2;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=res;
    }

    public static void main(String[] args) {
        int[]arr  = {6,7,8,9,10};
        rotate_one(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
