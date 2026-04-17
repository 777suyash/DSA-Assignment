public class P8 {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        int arr[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-'a']++;
        }
        boolean find = true;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == 0) {
                find = false;
                break;
            }
        }
        System.out.println(find);
    }
}
