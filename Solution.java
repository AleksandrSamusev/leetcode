// 657. Robot Return to Origin

public class Solution {
    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        int upDown = 0;
        int leftRight = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                upDown++;
            } else if (moves.charAt(i) == 'D') {
                upDown--;
            } else if (moves.charAt(i) == 'L') {
                leftRight--;
            } else if (moves.charAt(i) == 'R') {
                leftRight++;
            }
        }
        return (upDown == 0 && leftRight == 0);
    }
}
