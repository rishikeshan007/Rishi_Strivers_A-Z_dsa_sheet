package Arrays_basics;

import java.util.ArrayList;
import java.util.HashSet;


/*

We can solve this problem using 2 ways:

Brute force: Using set
Optimized: Using 2 pointers

Note: When we hear a word "Unique" you should go with either set or Map
* */

public class union_array {

    public static ArrayList<Integer> union_arr_set(int[]arr1, int[]arr2){
        HashSet<Integer>hashSet = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            hashSet.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hashSet.add(arr2[i]);
        }
        for(int it:hashSet){
            list.add(it);
        }

        return list;

        /*

        T.C : O(n logn)+0(mlogn)+0(n1+n2)
        S.C : O(n1+n2)+O(n1+n2)--> this is for returing answer..

        * */

    }

    public static ArrayList<Integer> find_union_pointer(int[]arr1, int[]arr2){
        int i=0;
        int j=0;
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> Union = new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){

                if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i]) {
                    Union.add(arr1[i]);
                    i++;
                }

            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;


        /**
         * T.C : O(n+m)
         * S.C : O(n+m)
         * **/

}



    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6, 7};
        ArrayList<Integer> list = union_arr_set(arr1,arr2);
        for(int i:list){
            System.out.print(i+" ");
        }
        System.out.println();
        ArrayList<Integer> list1 = find_union_pointer(arr1,arr2);
        for(int i:list1){
            System.out.print(i+" ");
        }



    }
}
