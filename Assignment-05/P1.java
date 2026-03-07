public class P1{
    public static void main(String args[]){
        int n = 54321;
        int num =0;
        while (n != 0) { 
            n/=10;
            num++;
        }
        System.err.println(num);
    }
}