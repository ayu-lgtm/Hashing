import java.util.*;

public class Intersection_Of_Unsorted_Array {
    public static void main(String args[]){
        int arr[]={3,21,4,5,6,7,1,2,2};
        int brr[]={5,6,4,3,7,2,8,1};
        Set<Integer> s = new HashSet<>();
        for(int x:arr){
            s.add(x);
        }

        for(int x:brr){
            if(s.contains(x)){
                System.out.print(x+" ");
            }
            s.remove(x);
        }   
    }
}
