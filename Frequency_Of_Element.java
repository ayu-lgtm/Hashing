import java.util.HashMap;
import java.util.Map.Entry;

public class Frequency_Of_Element {
    public static void main(String args[]){
        int arr[]={4,3,5,2,6,1,7,1,6,4,2,5,2,3};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }

        for(Entry<Integer, Integer> e :hm.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
