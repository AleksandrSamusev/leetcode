//1025. Divisor Game

public class Solution {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(divisorGame(n));
    }

    public static boolean divisorGame(int n) {
        return n % 2 == 0;
    }
}
