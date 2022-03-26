import java.util.HashSet;

public class SubArray_With_0_Sum {
    public static void main(String args[]){
        Integer arr[]={-1,4,-3,5,1};
        HashSet<Integer> hs = new HashSet<>();
        int prefixsum=0;
        for(int x:arr){
            prefixsum+=x;
            if(prefixsum==0){
                System.out.print("True");
                break;
            }else if(hs.contains(prefixsum)){
                System.out.print("True");
                break;
            }
            hs.add(prefixsum);
        }
    }
}
