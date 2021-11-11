import java.util.*;
// 1) Write a function that given a list of countries, returns the country(s) that occur the least/min times
// Example:- ["Argentina", "Cuba", "Chile", "Argentina"]
// Result:-
// ["Cuba", "Chile"] 
class Interview{

    public static void countries (String[] a){

        // String[] min;
        // Collections.sort(a);
    
        // for (int i = 0; i < a.length; i++){
        //     if(a[i] == a[i + 1])
        //     {
        //         break;
        //     }
        //     else{
        //         min[i] = a[i];
        //     }
        // }

        // System.out.println(min);
        

        
    }


// 2) Find the 2nd largest and 2nd smallest number in two arrays of numbers combined
// Example:- [10,5,7,2,4,1,24] & [8,23,29,25,40,0,24]
// Result:-
// 2nd Largest: 29 && 2nd Smallest: 1 
    public static void numbers(int[] a1, int[] a2){
        Set<Integer> newSet = new HashSet<>();

        for (int i : a1){
            newSet.add(i);
        }
        for (int i : a2){
            newSet.add(i);
        }

        List<Integer> nums = new ArrayList<>(newSet);
        Collections.sort(nums);
        System.out.println("2nd Largest: " + nums.get(nums.size() - 2) + " 2nd Smallest: " + nums.get(1));

    }

// 3) Write a function to represent a Triangle, given input is the number of rows of the triangle
// Example - if the number of rows are 3
// Result:-
// 1
// 2 3
// 4 5 6
    public static void triangle(int n){
        int num = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");
        }
    }
    public static void main (String[] args){
        int[] a1 = {10,5,7,2,4,1,24};
        int[] a2 = {8,23,29,25,40,0,24};
        String[] as = {"Argentina", "Cuba", "Chile", "Argentina"};
        countries(as);
        numbers(a1, a2);

        triangle(5);
    }
}
