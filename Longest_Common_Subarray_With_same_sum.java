
import java.util.*;

public class Longest_Common_Subarray_With_same_sum {
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
        int arr1[] = { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 };
        int arr2[] = { 0, 1, 1, 1, 0, 0, 1, 1, 0, 1 };
        int temp[]=new int[arr1.length];
        for (int x = 0; x < arr1.length; x++) {
            temp[x]=arr1[x]-arr2[x];
        }

        Longest_subarray_0_sum(temp, temp.length);
    }
}
