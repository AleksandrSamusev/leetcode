//1025. Divisor Game

public class Solution {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(divisorGame(n));
    }

    public static boolean divisorGame(int n) {
        if (n % 2 != 0) {
            return false;
        }
        return true;
    }
}
