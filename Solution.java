//326_Power_of_Three

public class Solution {
    public static void main(String[] args) {
        int n = -3;
        System.out.println(isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                return false;
            }
        }
        return true;
    }
}
