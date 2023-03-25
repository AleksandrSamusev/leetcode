//1103. Distribute Candies to People

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int candies = 7;
        int num_people = 4; //
        System.out.println(Arrays.toString(distributeCandies(candies, num_people)));
    }

    public static int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int value = 1;
        while (candies > 0) {
            for (int i = 0; i < num_people; i++) {
                if (candies < value) {
                    result[i] = result[i] + candies;
                    candies = 0;
                    break;
                }
                result[i] = result[i] + value;
                candies -= value;
                if (candies <= 0) {
                    break;
                }
                value++;
            }
        }
        return result;
    }
}
