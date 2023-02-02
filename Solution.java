//1046_Last_Stone_Weight

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(lastStoneWeight(nums));
    }

    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        Arrays.sort(stones);
        while ((stones[stones.length - 2]) > 0) {
            if (stones[stones.length - 2] == stones[stones.length - 1]) {
                stones[stones.length - 2] = 0;
                stones[stones.length - 1] = 0;
            } else if (stones[stones.length - 2] > stones[stones.length - 1]) {
                stones[stones.length - 2] = stones[stones.length - 2] - stones[stones.length - 1];
                stones[stones.length - 1] = 0;
            } else {
                stones[stones.length - 1] = stones[stones.length - 1] - stones[stones.length - 2];
                stones[stones.length - 2] = 0;
            }
            Arrays.sort(stones);
        }
        return stones[stones.length - 1];
    }
}
