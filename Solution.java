//2303. Calculate Amount Paid in Taxes

public class Solution {
    public static void main(String[] args) {
        int[][] brackets = {{4, 8}, {5, 49}};
        int income = 2;
        System.out.println(calculateTax(brackets, income));
    }

    public static double calculateTax(int[][] brackets, int income) {
        int rest = 0;
        double taxAmount = 0;
        if (income == 0) {
            return 0.0;
        }
        for (int i = 0; i < brackets.length; i++) {
            if (brackets[i][0] <= income) {
                if (i == 0) {
                    taxAmount += brackets[i][0] * brackets[i][1] / 100.0;
                } else {
                    taxAmount += (brackets[i][0] - brackets[i - 1][0]) * brackets[i][1] / 100.0;
                }
            } else {
                if (i != 0) {
                    rest = income - brackets[i - 1][0];
                    taxAmount += (rest * brackets[i][1] / 100.0);
                    return taxAmount;
                } else {
                    taxAmount += income * brackets[i][1] / 100.0;
                    return taxAmount;
                }
            }
        }
        return taxAmount;
    }
}
