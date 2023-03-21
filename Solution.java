//1317. Convert Integer to the Sum of Two No-Zero Integers

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(getNoZeroIntegers(n)));
    }

    public static int[] getNoZeroIntegers(int n) {
        int firstNumber = 1;
        int secondNumber = n - firstNumber;
        while (isHasZeros(firstNumber) || isHasZeros(secondNumber)) {
            firstNumber++;
            secondNumber = n - firstNumber;
        }
        return new int[]{firstNumber, secondNumber};
    }

    public static boolean isHasZeros(int n) {
        while (n > 0) {
            if (n % 10 == 0) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}
