import java.util.*;

class LeetCode {
    public static List<String> fizzBuzz(int n){
        List<String> answer = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0){
                answer.add("FizzBuzz");
            }
            else if (i % 5 == 0){
                answer.add("Buzz");
            }
            else if (i % 3 == 0){
                answer.add("Fizz");
            }
            else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
        
        
    }

// 1) Find the 2nd largest and 2nd smallest number in two arrays of numbers combined
// I.e. - [10,5,7,2,4,1,24] & [8,23,29,25,40,0,24] -> 2nd Largest : 29 , 2nd Smallest: 1  
    public static void secondLS(int[] a1, int[] a2) {
        
        Set<Integer> newSet = new HashSet<Integer>();
        a1.forEach(newSet.add, newSet);
        a2.forEach(newSet.add, newSet);

        System.out.println(newSet);

    }

    public static void main(String[] args)
    {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5};

        secondLS(a1, a2);
        
        
        
    }
}