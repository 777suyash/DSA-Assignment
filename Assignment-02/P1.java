
import java.util.Scanner;

class P1{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++ ) {
            for (int j = 1; j <= n; j++) {
                if ((i > 1 && i < n) && (j > 1 && j < n)) {
                    System.err.print("  ");
                }
                else{
                    System.err.print("* ");
                }
            }
            System.err.println();
        }
    }
}