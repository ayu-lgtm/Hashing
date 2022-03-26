import java.util.*;

public class More_Than_nbyK_Occurance {
    public static void main(String args[]){
        int arr[]={4,4,1,3,4,4,6,2,1,3,2,1};
        int k=4;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()>arr.length/k){
                System.out.print(e.getKey()+" ");
            }
        }
    }
}
