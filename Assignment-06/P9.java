public class P9 {
    public static void main(String args[]){
        fun(3);
    }
    static void fun(int n){
        if (n <= 1) {
            System.out.print(n+" ");
            return;
        }
        fun(n-1);
        System.out.print(n+" ");
        fun(n-2);
    }
}
