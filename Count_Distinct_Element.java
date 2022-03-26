import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Count_Distinct_Element {
    public static void main(String args[]){
        Integer arr[]={6,5,7,4,3,8,2,4,2,4,1,6};

        Set<Integer> hs = new HashSet<>(Arrays.asList(arr));

        System.out.print(hs.size());
    }
}
