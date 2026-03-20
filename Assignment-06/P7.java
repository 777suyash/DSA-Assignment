public class P7 {
    public static void main(String[] args) {
        fun(3);
    }
    static void fun(int n){
        if (n <= 0) {
            return;
        }
        System.out.print("A"+n+" ");
        fun(n-1);
        System.out.print("B"+(n*2)+" ");
    }
}
