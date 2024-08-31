package Arrays_basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class largest_element {

    public static int largest_ele(int[]arr){

        Arrays.sort(arr);
        int val = arr[arr.length-1];
        return val;


    }

    public static void main(String[] args) {
        int[]arr = {20,10,90,44,89};
        System.out.println("The largest element is:"+ largest_ele(arr));
    }
}
