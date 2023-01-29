// 258. Add Digits
public class Solution {
    public static void main(String[] args) {
        System.out.println(addDigits(154));
    }

    public static int addDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int d = num % 10;
            sum += d;
            num = num / 10;
            if (num == 0 && sum > 9) {
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }
}
