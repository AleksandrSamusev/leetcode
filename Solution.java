//728. Self Dividing Numbers

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int left = 66;
        int right = 708;
        System.out.println(selfDividingNumbers(left, right));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        List<Integer> remove = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int n = i;
            if (i % 10 != 0) {
                while (n > 0) {
                    int temp = n % 10;
                    if (temp == 0) {
                        remove.add(i);
                        break;
                    }
                    if (i % temp != 0) {
                        if (!remove.contains(i)) {
                            remove.add(i);
                        }
                    }
                    n = n / 10;
                }
                list.add(i);
            }
        }
        list.removeAll(remove);
        return list;
    }
}
