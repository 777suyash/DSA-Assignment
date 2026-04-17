public class P6 {
    public static void main(String[] args) {
        String str = "apple";
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                char ch = (char)(i+'a');
                System.out.println(ch);
            }
        }   
    }
}
