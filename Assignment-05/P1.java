public class P1{
    public static void main(String args[]){
        int n = 54321;
        int count = 0;
        while(n != 0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}