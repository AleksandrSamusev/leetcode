//1523. Count odd numbers in an interval range

public class Solution {
    public static void main(String[] args) {
        int low = 14;
        int high = 17;
        System.out.println(countOdds(low, high));
    }

    public static int countOdds(int low, int high) {
        int result = 0;
        if ((low % 2 != 0 && high % 2 != 0) || (low % 2 != 0 && high % 2 == 0) || (low % 2 == 0 && high % 2 != 0)) {
            result = ((high - low) / 2) + 1;
        } else {
            result = (high - low) / 2;
        }
        return result;
    }
}
