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

            // naive approach
            // O(n ^ 2)
            // for (int j = 0 ;j < i; j++){
            //     //System.out.println(i + " " + j);
            //     if(nums[i] + nums[j] == target){
            //         a = new int[]{i , j};
            //         return a;
            //     }
            // }
            
            
                
            if (map.containsKey(target - nums[i])){
                a[0] = i;
                a[1] = map.get(target - nums[i]);

                System.out.println(a[0] + " " +a[1]);
                return a;
            }
            map.put(nums[i], i);

            //O(n)
            
            // System.out.println(map);
            
            
            
            
        }
        return a;
        // time comp: O(n^2)


    }
    public static void main (String[] args){
        int[] a = new int[]{2, 7, 11, 15};
        twoSum(a , 9);
    }
}