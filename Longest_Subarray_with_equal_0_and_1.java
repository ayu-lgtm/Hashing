import java.util.*;

public class Longest_Subarray_with_equal_0_and_1 {
    public static void Longest_subarray_0_sum(int arr[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int presum = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            presum += arr[i];
            if (presum == sum) {
                res = i + 1;
            }
            if (hm.containsKey(presum) == false) {
                hm.put(presum, i);
            }
            if (hm.containsKey(presum - sum)) {
                res = Math.max(res, i - (hm.get(presum - sum)));
            }
        }
        System.out.print(res);
    }

    public static void main(String args[]) {
        int arr[] = { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 };

        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == 0) {
                arr[x] = -1;
            }
        }

        Longest_subarray_0_sum(arr, arr.length);
    }
}
