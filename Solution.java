//2154. Keep Multiplying Found Values by Two

public class Solution {
    public static void main(String[] args) {
        int[] nums = {5, 3, 6, 1, 12};
        int original = 3;
        System.out.println(findFinalValue(nums, original));
    }

    public static int findFinalValue(int[] nums, int original) {
        int[] array = new int[1001];
        for (int num : nums) {
            array[num]++;
        }

        while (array[original] > 0) {
            original *= 2;
            if (original >= array.length) {
                return original;
            }
        }
        return original;
    }
}
