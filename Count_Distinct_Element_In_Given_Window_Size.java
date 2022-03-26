import java.util.*;

public class Count_Distinct_Element_In_Given_Window_Size {
    public static void main(String args[]){
        int arr[]={10,20,20,10,30,40,10};
        int k=4;

        Map<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<k;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
    
        System.out.println(hm.size()+" "+hm);
        for(int i=k;i<arr.length;i++){
            
            if(hm.get(arr[i-k])==1){
                hm.remove(arr[i-k]);
            }
            else{
                hm.put(arr[i-k],hm.get(arr[i-k])-1);
            }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            System.out.println(hm.size()+" "+hm);
        }

    }
}
