package Arrays_basics;
import java.util.*;
public class max_cons_of_1s {

    public static int max_cons(int[]arr){
        int maxi=0;
        int count=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==1){
                count++;
                maxi = Math.max(maxi,count);
            }
            else{
                count=0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[]arr = {1,1,0,1,1,1,1,0,1,1};
        int ans = max_cons(arr);
        System.out.println("The maximum consecutive number of 1's is:"+ ans);
    }
}
