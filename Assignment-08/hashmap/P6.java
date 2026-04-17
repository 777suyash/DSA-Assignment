import java.util.*;

public class P6 {
    public static void main(String[] args) {
        String str = "apple";
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0)+1);
        }
        for (Map.Entry<Character,Integer> entry : hm.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
