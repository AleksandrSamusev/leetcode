//2591. Distribute Money to Maximum Children

public class Solution {
    public static void main(String[] args) {
        int money = 13;
        int children = 3;
        System.out.println(distMoney(money, children));
    }

    public static int distMoney(int money, int children) {
        if (money < children) {
            return -1;
        }
        int result = 0;
        int moneyLeft = money - children;
        while (moneyLeft >= 7 && result != children) {
            result++;
            moneyLeft -= 7;
        }
        if (result == children && moneyLeft > 0 || result == children - 1 && moneyLeft == 3) {
            return --result;
        }
        return result;
    }
}
