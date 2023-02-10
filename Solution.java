//374. Guess Number Higher or Lower

public class Solution extends GuessGame {
    public static void main(String[] args) {
        System.out.println(guessNumber(50));
    }

    public static int guessNumber(int n) {
        int low = 0;
        int high = n;
        int mid = 0;
        if (guess(low) == 0) {
            return low;
        } else if (guess(high) == 0) {
            return high;
        } else {
            while (low < high) {
                mid = low + (high - low) / 2;
                if (guess(mid) < 0) {
                    high = mid;
                } else if (guess(mid) > 0) {
                    low = mid;
                } else {
                    break;
                }
            }
        }
        return mid;
    }
}
