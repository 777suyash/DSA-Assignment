public class P6 {
    public static void main(String[] args) {
        fun(8);
    }
    static void fun(int n){
        if (n <= 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n);
        fun(n/2);
        System.out.print(n);
    }
}
