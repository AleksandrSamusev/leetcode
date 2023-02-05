//771. Jewels and Stones

public class Solution {
    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (stones.charAt(j) == jewels.charAt(i)) {
                    count++;
                }
            }
        }
        return count;
    }
}
