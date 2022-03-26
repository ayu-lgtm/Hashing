import java.util.HashMap;

public class Longest_Subarray_With_Given_Sum {
    public static void main(String args[]){
        int arr[]={5,8,-4,-4,9,-2,2};
        int sum=0;

        HashMap<Integer,Integer> hm = new HashMap<>();
        int presum=0;

        int res=0;
       
        for(int i=0;i<arr.length;i++){
            presum+=arr[i];
            if(presum==sum){
                res=i+1;
            }
            if(hm.containsKey(presum)==false){
                hm.put(presum,i);
            }
            if(hm.containsKey(presum-sum)){
                res=Math.max(res,i-hm.get(presum-sum));
               
            }
        }
        System.out.print(res);
    }
}
