public class P14 {
    public static void main(String[] args) {
        int n = 28;
        int num = n/2;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (n%i == 0) {
                sum+=i;
            }
        }
        if (n == sum) {
            System.out.println("perfect number");
        }else{
            System.out.println("not");
        }
    }
}