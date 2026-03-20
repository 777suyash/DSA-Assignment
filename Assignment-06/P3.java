public class P3 {
    public static void main(String[] args) {
        fun(4);
    }
    static void fun(int n){
    if(n <= 1){
        System.out.print(n + " ");
        return;
    }
    fun(n-2);
    System.out.print(n + " ");
    fun(n-2);
}
}
