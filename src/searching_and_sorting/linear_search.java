package searching_and_sorting;

public class linear_search {

    public static int linear_search_algo(int[]arr, int target){
        int ans = -1;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==target){
                ans = i;
            }

        }
        return ans;
    }

    /* Time complexity: O(n) */

    public static void main(String[] args) {
        int[]arr = {10,20,30,40,50};
        int target = 40;
        int ans = linear_search_algo(arr,target);
        if(ans!=-1){
            System.out.println("The element found at the position:"+ ans);
        }
        else{
            System.out.println("The element is not found");
        }
    }
}
