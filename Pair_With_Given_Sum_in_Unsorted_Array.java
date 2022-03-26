import java.util.HashSet;
import java.util.Set;

public class Pair_With_Given_Sum_in_Unsorted_Array {
    public static void main(String args[]){
        int arr[]={3,2,8,15,-8};

        int sum=11;

        Set<Integer> hs = new HashSet<>();

        for(int x:arr){
            if(hs.contains(sum-x)){
                System.out.print((sum-x)+" "+x);
                break;
            }
            hs.add(x);
        }
    }
}
