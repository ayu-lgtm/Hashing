
import java.util.HashSet;

public class Subarray_Sum_with_given_sum {
    public static void main(String args[]) {
        Integer arr[] = { 5,8,6,13,3,-1};
        HashSet<Integer> hs = new HashSet<>();
        int sum=22;
        int prefixsum = 0;
        for (int x : arr) {
            prefixsum += x;
            if (prefixsum == sum) {
                System.out.print("True");
                break;
            } else if (hs.contains(prefixsum-sum)) {
                System.out.print("True");
                break;
            }
            hs.add(prefixsum);
        }
    }
}
