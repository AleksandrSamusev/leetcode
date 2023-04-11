//1598. Crawler Log Folder

public class Solution {
    public static void main(String[] args) {
        String[] logs = {"d1/", "d2/", "../", "d21/", "./"};
        System.out.println(minOperations(logs));
    }

    public static int minOperations(String[] logs) {
        int steps = 0;
        for (int i = 0; i < logs.length; i++) {
            if (!logs[i].equals("../") && !logs[i].equals("./")) {
                steps++;
            } else if (logs[i].equals("../") && steps > 0) {
                steps--;
            }
        }
        return steps;
    }
}
