
import java.util.*;

public class P7 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        int max = 0;
        int max_element = arr[0];
        int second = 0;
        int second_element = arr[0];
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            if (entry.getValue() > max) {
                second = max;
                second_element = max_element;
                max = entry.getValue();
                max_element = entry.getKey();
            }
            if (entry.getValue() > second && max_element != entry.getKey()) {
                second = entry.getValue();
                second_element = entry.getKey();
            }
        }
        System.out.println(second_element);
    }
}
