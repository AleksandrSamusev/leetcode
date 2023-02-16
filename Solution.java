//682. Baseball Game


import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String[] str = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(str));
    }

    public static int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();

        int counter = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int temp = list.get(list.size() - 1) + list.get(list.size() - 2);
                list.add(temp);
                counter += temp;
            } else if (operations[i].equals("C")) {
                int temp = list.get(list.size() - 1);
                counter -= temp;
                list.remove(list.size() - 1);
            } else if (operations[i].equals("D")) {
                int temp = list.get(list.size() - 1) * 2;
                list.add(temp);
                counter += temp;
            } else if (Character.isDigit(operations[i].charAt(0)) || Character.isDigit(operations[i].charAt(1))) {
                int temp = Integer.parseInt(operations[i]);
                list.add(temp);
                counter += temp;
            }
        }

        return counter;
    }
}
