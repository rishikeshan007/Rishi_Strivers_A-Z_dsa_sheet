package Arrays_Medium;

import java.sql.Array;
import java.util.*;
public class leaders_in_array {

    public static ArrayList<Integer> leader_array_brute(int[]arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int check = 0;
            for(int j=i+1;j<arr.length;j++){

                if(arr[j]>arr[i]){
                    check++;
                }
            }
            if(check==0){
                list.add(arr[i]);
            }
        }
        if(list.contains(arr[arr.length-1])){
        }
        else{
            list.add(arr[arr.length-1]);
        }

        return list;
    }

    public static ArrayList<Integer> leader_array_optimal(int[]arr){

        ArrayList<Integer>list = new ArrayList<>();
        int max = arr[arr.length-1];
        list.add(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        return list;


    }

    public static void main(String[] args) {
        //int[]arr = {4,7,1,0};
        int[]arr = {10,22,12,3,0,6};

        //brute  force
        //ArrayList<Integer> list = leader_array_brute(arr);

        //optimal approach
        ArrayList<Integer> list = leader_array_optimal(arr);
        Collections.sort(list, Collections.reverseOrder());  // reverse the arraylist using collections
        for(int i: list){
            System.out.print(i+" ");
        }

    }
}
