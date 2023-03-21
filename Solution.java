//2269. Find the K-Beauty of a Number

public class Solution {
    public static void main(String[] args) {
        int num = 240;
        int k = 2;
        System.out.println(divisorSubstrings(num, k));
    }

    public static int divisorSubstrings(int num, int k) {
        String sNum = String.valueOf(num);
        int counter = 0;
        if (sNum.length() == k) {
            return 1;
        }
        for (int i = 0; i <= sNum.length() - k; i++) {
            String check = sNum.substring(i, i + k);
            int value = Integer.parseInt(check);
            if (value > 0 && num % value == 0) {
                counter++;
            }
        }
        return counter;
    }
}
