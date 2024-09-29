package Arrays_Medium;

import java.util.*;

public class Rearrange_positive_negatives {

    public static int[] rearrange_brute(int[]arr){

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0;i<arr.length;i++){

            if(arr[i]>0){
                list1.add(arr[i]);
            }
            else{
                list2.add(arr[i]);
            }
        }

        int[]res = new int[list1.size()+list2.size()];
        int count = 0;
        for(int j=0;j<res.length;j+=2){
            res[j] = list1.get(count);
            res[j+1] = list2.get(count);
            count++;
        }
        return res;

    }

    public static void main(String[] args) {
        int[]arr = {1,2,-4,-5};
        int[]res  =  rearrange_brute(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
}
