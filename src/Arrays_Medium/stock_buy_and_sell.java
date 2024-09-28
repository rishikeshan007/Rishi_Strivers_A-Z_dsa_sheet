package Arrays_Medium;

import java.util.*;
public class stock_buy_and_sell {
    public static int brute_force_stock_price(int[]arr){
        int maxPrice = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                maxPrice = Math.max(arr[j]-arr[i],maxPrice);
            }
        }
        return maxPrice;
    }
    public static int optimal_solution(int[]arr){
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrice);
        }
        return maxPro;

    }


    public static void main(String[] args) {
        int[]arr = {7,1,5,3,6,4};
        int max_Price = brute_force_stock_price(arr);
        System.out.println("The Max price is:"+ max_Price);
    }
}
