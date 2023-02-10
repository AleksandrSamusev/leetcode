public class GuessGame {
    static int num = 12;

    public static int guess(int n) {
        return Integer.compare(num, n);
    }
}
