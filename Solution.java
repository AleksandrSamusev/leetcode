//1295. Find Numbers with Even Number of Digits

public class Solution {
    public static void main(String[] args) {
        int[] nums = {121, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (countDigits(num) % 2 == 0) {
                result++;
            }
        }
        return result;
    }

    public static int countDigits(int num) {
        int result = 0;
        while (num > 0) {
            result++;
            num /= 10;
        }
        return result;
    }
}
