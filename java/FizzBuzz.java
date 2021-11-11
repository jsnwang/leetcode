import java.util.ArrayList;
import java.util.List;

class FizzBuzz {
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
    public static void main(String[] args) {
        System.out.println("n = 3 " + fizzBuzz(3));
        System.out.println("n = 5 " + fizzBuzz(5));
        System.out.println("n = 100 " + fizzBuzz(100));
    } 
}