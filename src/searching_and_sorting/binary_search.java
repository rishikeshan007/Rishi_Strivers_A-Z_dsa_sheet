package searching_and_sorting;

public class binary_search {

    public static int binary_search_algo(int[]arr, int target){
        int res = -1;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                res = mid;
                break;
            }
            if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[]arr = {10,20,30,40,50};
        int target = 40;
        int ans = binary_search_algo(arr,target);
        if(ans!=-1){
            System.out.println("The element found at the position:"+ ans);
        }
        else{
            System.out.println("The element is not found");
        }
    }
}
