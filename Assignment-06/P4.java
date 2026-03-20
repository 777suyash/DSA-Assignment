public class P4 {
    public static void main(String args[]){
        fun(2);
    }
    static void fun(int n){
        if(n==0) return;
        fun(n-1);
        System.out.print(n*n+" ");
        fun(n-1);
    }
}
