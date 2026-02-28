
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter");
        int n = sc.nextInt();

        int num1 = 1;
        int num2 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j ) {
                    System.err.print(num1+" ");
                    num1++;
                }
                else if ((i + j == n-1)) {
                    System.err.print(num2+" ");
                    num2++;
                }
                 else{
                    System.err.print("  ");
                }
            }
            System.err.println();
        }
    }
}
