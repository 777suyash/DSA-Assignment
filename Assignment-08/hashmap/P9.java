
import java.util.*;

public class P9 {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,2,2,3,7};
        int[] arr2 = {1,1,2,2,2,3};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            hm.put(arr1[i], hm.getOrDefault(arr1[i], 0)+1);
        }
        for (int i = 0; i < arr2.length; i++) {
            hm.put(arr2[i], hm.getOrDefault(arr2[i], 0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            if(entry.getValue() ==1 ){
                System.out.println(entry.getKey());
            }
        }
    }
}
