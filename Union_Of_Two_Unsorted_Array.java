import java.util.HashSet;
import java.util.Set;

public class Union_Of_Two_Unsorted_Array {
    public static void main(String args[]){
        int arr[]={5,4,6,3,7,2,8,1};
        int brr[]={8,7,6,9,4,0,5,32,5,1};

        Set<Integer> s = new HashSet<>();
        for(int x:arr){
            s.add(x);
        }
        for(int x:brr){
            s.add(x);
        }

        System.out.print(s.size());
    }
}
