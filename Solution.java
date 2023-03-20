//1304. Find N Unique Integers Sum up to Zero

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int temp = 1;

        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                result[i] = -n / 2 + i;
            }
            for (int i = n / 2; i < result.length; i++) {
                result[i] = temp;
                temp++;
            }
        } else {
            n--;
            for (int i = 0; i < n / 2; i++) {
                result[i] = -n / 2 + i;
            }
            for (int i = n / 2 + 1; i < result.length; i++) {
                result[i] = temp;
                temp++;
            }
        }
        return result;

    }
}
