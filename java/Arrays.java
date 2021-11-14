import java.util.*;

class Arrays{

    // 1. Two Sum https://leetcode.com/problems/two-sum/
    // Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    // You may assume that each input would have exactly one solution, and you may not use the same element twice.
    // You can return the answer in any order.
    public static int[] twoSum(int[] nums, int target){
        int[] a = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                a[0] = i;
                a[1] = map.get(target - nums[i]);

                System.out.println(a[0] + " " +a[1]);
                return a;
            }
            map.put(nums[i], i);

            //O(n)
            

            // naive approach
            // O(n ^ 2)
            // for (int j = 0 ;j < i; j++){
            //     //System.out.println(i + " " + j);
            //     if(nums[i] + nums[j] == target){
            //         a = new int[]{i , j};
            //         return a;
            //     }
            // }
            
            // System.out.println(map);
            
        }
        return a;


    }

    // 121. Best Time to Buy and Sell Stock https://leetcode.com/problems/best-time-to-buy-and-sell-stock/.
    // You are given an array prices where prices[i] is the price of a given stock on the ith day.
    // You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
    // Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    public static int maxProfit(int[] prices){
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++){
            if (min > prices[i]){
                min = prices[i];

                
            }
            if(prices[i] - min> max){ 
                max = prices[i] - min;
               
            }
        }
        return max;
    } // O(n)
    public static void main (String[] args){
        int[] a = new int[]{2, 7, 11, 15};
        int[] a1 = new int[]{7, 1, 5, 3, 6, 4};

        maxProfit(a1);
        //twoSum(a , 9);
    }
}