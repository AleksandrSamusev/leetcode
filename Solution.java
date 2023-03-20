//605. Can Place Flowers

public class Solution {
    public static void main(String[] args) {
        int[] flowerbed = {0, 1, 0};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int notZeros = 0;
        int zeroIndex = -1;
        int zeros = 0;
        int count = 0;

        if (flowerbed.length == 1 && flowerbed[0] == 1 && n == 0) {
            return true;
        } else if (flowerbed.length == 1 && flowerbed[0] == 1 && n == 1) {
            return false;
        } else if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1) {
            return true;
        }
        if (flowerbed[0] == 0) {
            zeroIndex = 0;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                zeros++;
                if (i == flowerbed.length - 1 && notZeros == 0) {
                    if (flowerbed.length % 2 == 0) {
                        count = flowerbed.length / 2;
                    } else {
                        count = flowerbed.length / 2 + 1;
                    }
                    return count >= n;
                } else if (i == flowerbed.length - 1 && notZeros != 0) {
                    count += zeros / 2;
                    return count >= n;
                }
            } else {
                notZeros++;
                if (zeroIndex == 0 && zeros >= 2) {
                    count += zeros / 2;
                    zeros = 0;
                    zeroIndex = -1;
                } else if (zeros >= 3 && zeros % 2 != 0) {
                    count += zeros / 2;
                } else if (zeros >= 3) {
                    count += zeros / 2 - 1;
                }
                zeros = 0;
            }

        }
        return count >= n;
    }
}
