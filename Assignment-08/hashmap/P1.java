
import java.util.*;

class P1{
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4};
        HashMap<Integer,Integer>hm = new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        int max = arr[0];
        int max_element = 0;
        int second = arr[0];
        int second_element = 0;
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
            if (max_element < entry.getValue()) {
                second = max;
                second_element = max_element;
                max = entry.getValue();
                max_element = entry.getKey(); 
            }
            if (entry.getValue() > second && entry.getValue() != max) {
                second = entry.getValue();
                second_element = entry.getKey();
            }
        }
        System.out.println(second_element);
    }
}