//292. Nim Game

public class Solution {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(canWinNim(n));
    }

    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
