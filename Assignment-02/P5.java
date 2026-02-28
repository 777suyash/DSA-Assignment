public class P5 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((i + j) % 2) == 0) {
                    System.err.print("* ");
                }else{
                    System.err.print("# ");
                }
            }
            System.err.println();
        }
    }
}
