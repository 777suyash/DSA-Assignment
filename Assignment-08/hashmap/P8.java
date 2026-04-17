
import java.util.*;

public class P8 {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i), 0)+1);
        }
        boolean find = true;
        for (Map.Entry<Character,Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 0) {
                find = false;
            }
        }
        System.out.println(find);
    }
}
