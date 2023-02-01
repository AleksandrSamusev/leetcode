//412_FizzBuzz

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n) {
        ArrayList<String> array = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                array.add("FizzBuzz");
            } else if (i % 3 == 0) {
                array.add("Fizz");
            } else if (i % 5 == 0) {
                array.add("Buzz");
            } else {
                array.add(String.valueOf(i));
            }
        }
        return array;
    }
}