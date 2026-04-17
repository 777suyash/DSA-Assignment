
import java.util.*;

public class P2 {
    public static void main(String args[]){
        int arr[] = {1,1,2,2,2,3};
        int k = 2;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if (entry.getValue() > k) {
                System.out.println(entry.getKey());
            }
        }
    }

}
