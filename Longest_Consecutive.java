import java.util.*;

public class Longest_Consecutive {
    public static void main(String args[]) {
        int arr[] = { 1, 9, 3, 4, 2, 20 };
        Set<Integer> s = new HashSet<>();

        for (int x : arr) {
            s.add(x);
        }

        int res = 0;
        for (Integer x : s) {
            if (s.contains(x - 1) == false) {
                int curr = 1;
                while (s.contains(x + curr) == true) {
                    curr++;
                }
                res = Math.max(res, curr);
            }
        }
        System.out.print(res);
    }
}
