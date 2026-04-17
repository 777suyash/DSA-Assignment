import java.util.*;

public class P11 {
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";
        boolean ans = true;

        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            hm.put(str1.charAt(i), hm.getOrDefault(str1.charAt(i), 0)+1);
        }
        for (int i = 0; i < str2.length(); i++) {
            hm.put(str2.charAt(i), hm.getOrDefault(str2.charAt(i), 0)+1);
        }
        for (Map.Entry<Character,Integer> entry : hm.entrySet()) {
            if (entry.getValue() != 2) {
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
