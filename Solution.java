// 342. Power of Four

public class Solution {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }

    public static boolean isPowerOfFour(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1 || n == 4) {
            return true;
        }
        while (n % 4 == 0) {
            n = n / 4;
            if (n == 4) {
                return true;
            }
        }
        return false;
    }
}
