package Arrays_basics;

import java.util.Arrays;

public class second_largest_smallest {

    public static void second_larg_small_sorting(int[]arr){

          /* this is the brute force approach and it has:
          t.c = o(nlogn)
          s.c = o(1)
         */

        Arrays.sort(arr);
        System.out.println("The second smallest and largest element is:"+ arr[1]+" "+arr[arr.length-2]);

    }

    public static void second_large_small_method2(int[]arr){

        /* this is the Better force approach and it has:
          t.c = o(n) - but two linear traversals
          s.c = o(1)
         */

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0;i <= arr.length-1;i++)
        {
            small = Math.min(small,arr[i]);
            large = Math.max(large,arr[i]);
        }
        for (i = 0;i <=arr.length-1;i++)
        {
            if (arr[i] < second_small && arr[i] != small)
            {
                second_small = arr[i];
            }
            if (arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }
        System.out.println("The second small and largest element is:"+ second_small +" "+ second_large);
    }

    /* optimized solution */

        /* this is the Optimzed approach and it has:
          t.c = o(n) - but only one linear traversals
          s.c = o(1)
         */

    static private int secondSmallest(int[] arr, int n)
    {
        if (n < 2)
        {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < n; i++)
        {
            if (arr[i] < small)
            {
                second_small = small;
                small = arr[i];
            }
            else if (arr[i] < second_small && arr[i] != small)
            {
                second_small = arr[i];
            }
        }
        return second_small;
    }
    static private int secondLargest(int[] arr, int n)
    {
        if(n<2)
            return -1;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++)
        {
            if (arr[i] > large)
            {
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large)
            {
                second_large = arr[i];
            }
        }
        return second_large;
    }



    public static void main(String[] args) {

        int[]arr = {20,80,76,191,89};
        second_larg_small_sorting(arr);
        second_large_small_method2(arr);
        /* for optimized solution */
        int n = arr.length;
        int sS = secondSmallest(arr, n);
        int sL = secondLargest(arr, n);
        System.out.println("Second smallest is "+sS);
        System.out.println("Second largest is "+sL);

    }
}
