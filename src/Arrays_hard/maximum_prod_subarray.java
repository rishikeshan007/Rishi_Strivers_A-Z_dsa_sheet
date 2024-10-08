package Arrays_hard;
import java.util.*;
public class maximum_prod_subarray {

    public static int max_prod_brute(int[]arr){
        int result = arr[0];
        for(int i=0;i<arr.length-1;i++) {
            int p = arr[i];
            for(int j=i+1;j<arr.length;j++) {
                result = Math.max(result,p);
                p *= arr[j];
            }
            result = Math.max(result,p);
        }
        return result;

        /* tc: O(n^2)
           sc: o(1)
         */
    }

    public static int max_brute_opti(int[]arr){
        int pre = 1;
        int suf = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            /* here while multiplying if pre and suf becomes 0 we need to make it as 1 */
            if(pre==0){
                pre=1;
            }
            if(suf==1){
                suf=1;
            }
            pre = pre*arr[i];
            suf = suf*arr[arr.length-1-i];
            max = Math.max(max,Math.max(pre,suf));
        }
        return max;
    }

    public static void main(String[] args) {
        int[]arr = {2,3,-2,4};
        int ans = max_prod_brute(arr);
        System.out.println(ans);

        int ans1 = max_brute_opti(arr);
        System.out.println(ans1);
    }
}
