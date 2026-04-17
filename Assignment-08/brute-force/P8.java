public class P8 {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        char ch = 'a';
        boolean check = true;
        for (int i = 0; i < 26; i++) {
            boolean exist = false;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                check = false;
                break;
            }
            ch++;
        }
        System.out.println(check);
    }
}
 