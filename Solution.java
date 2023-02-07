//231. Power of Two

public class Solution {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1 || n == 2) {
            return true;
        }
        while (n % 2 == 0) {
            n = n / 2;
            if (n == 2) {
                return true;
            }
        }
        return false;
    }
}
