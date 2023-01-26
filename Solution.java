//202. Happy number

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {

        System.out.println(isHappy(4));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNextValue(n);
        }
        return n == 1;
    }

    private static int getNextValue(int num) {
        int sum = 0;
        while (num > 0) {
            int d = num % 10;
            num = num / 10;
            sum += d * d;
        }
        return sum;
    }
}
