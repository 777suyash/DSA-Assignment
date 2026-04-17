
public class P11 {

    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";

        boolean ans = true;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                boolean find = false;
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        find = true;
                    }
                }
                if (find == false) {
                    ans = false;
                    break;
                }
            }
        }else{
            ans = false;
        }
        System.out.println(ans);
    }
}
