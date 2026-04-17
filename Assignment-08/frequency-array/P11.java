
public class P11 {

    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";

        int arr1[] = new int[26];
        int arr2[] = new int[26];

        boolean ans = true;

        for (int i = 0; i < str1.length(); i++) {
            arr1[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            arr2[str2.charAt(i) - 'a']++;
        }

        if (str1.length() == str2.length()) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
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
