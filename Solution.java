//1281. Subtract the Product and Sum of Digits of an Integer

public class Solution {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int mult = 1;
        while (n > 0) {
            sum += n % 10;
            mult *= n % 10;
            n = n / 10;
        }
        return mult - sum;
    }
}
