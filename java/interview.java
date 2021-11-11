import java.util.*;

class Solution {

    // 1) Find the 2nd largest and 2nd smallest number in two arrays of numbers combined
    // I.e. - [10,5,7,2,4,1,24] & [8,23,29,25,40,0,24] -> 2nd Largest : 29 , 2nd Smallest: 1  
    public static void secondLS(int[] a1, int[] a2) {
        Set<Integer> newset = new HashSet<>();
        for (int i : a1){
            newset.add(i);
        }
        for (int i : a2){
            newset.add(i);
        }
        List<Integer> nums = new ArrayList<>(newset);
        Collections.sort(nums);
        System.out.println("2nd Largest: " + nums.get(nums.size() - 2) + ", 2nd Smallest: " + nums.get(1));

    }
    // 2) In this program, we need to find the smallest and the largest word present in the string and the length of those words:
    // “Hardships often prepare ordinary people for an extraordinary destiny” -> "extraordinary":13, "an":2
    public static void words(String s){
        String[] sa = s.split(" ");

        int smallest = 0;
        int largest = sa[sa.length - 1].length();

        for (int i = 0; i < sa.length - 1; i++){
            if(sa[i].length() < sa[smallest].length()){
                smallest = i;
            }
            if(sa[i].length() > sa[largest].length()){
                largest = i;
            }
        }
        System.out.println(sa[largest] + ":" + sa[largest].length() + ", " + sa[smallest] + ":" + sa[smallest].length());
    }
    
    // 3)Write a program to find the index of a value in a sorted array. If the value does not find return the index where it would be if it were inserted in order.
    // Example: 
    // [1, 2, 4, 5, 6] 5(target) -> 3(index)
    // [1, 2, 4, 5, 6] 0(target) -> 0(index)
    // [1, 2, 4, 5, 6] 7(target) -> 5(index)

    public static int binarySearch (int[] n, int value) {
        int left, right, mid;

        left = 0;
        right = n.length - 1;

        while (left <= right){
            mid = left + ((right - left) / 2);

            if (n[mid] == value) {
                return mid;
            }
            else if(n[mid] < value){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args)
    {
        int[] a = {1, 2, 4, 5, 6};
        int[] a2 = {3, 5};
        int[] a3 = {8,23,29,25,40,0,24};
        int[] a4 = {10,5,7,2,4,1,24};

        secondLS(a4, a3);

        words("Hardships often prepare ordinary people for an extraordinary destiny");
        // System.out.println(binarySearch(a, 5));
        // System.out.println(binarySearch(a, 0));
        // System.out.println(binarySearch(a, 7));



        
        
        
    }
}