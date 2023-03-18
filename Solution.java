//1342. Number of Steps to Reduce a Number to Zero

public class Solution {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 != 0) {
                num -= 1;
                steps++;
            } else {
                num /= 2;
                steps++;
            }
        }
        return steps;
    }
}
