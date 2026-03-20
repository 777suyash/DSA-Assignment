public class P2 {
    public static void main(String[] args) {
        fun(2);
    }
    static void fun(int n){
        if (n == 0) {
            return;
        }
        System.out.println("X");
        fun(n-1);
        System.out.println("Y");
        fun(n-1);
    }
}
