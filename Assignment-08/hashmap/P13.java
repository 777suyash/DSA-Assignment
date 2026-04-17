import java.util.*;

public class P13 {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3};

        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            arr[entry.getKey()] = entry.getValue();
        }

        // for (int i = 0; i < arr.length; i++) {
        //     if (hm.containsKey(i)) {
        //         arr[i] = hm.get(i);
                
        //     }
        // }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
