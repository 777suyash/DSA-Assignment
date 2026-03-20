public class P12 {
    public static void main(String args[]){
        int a = 48;
        int b = 18;
        int gcd = 1;
        while (a != 0 && b != 0) { 
            if (a>b) {
                a = a%b;
            }else{
                b = b%a;
            }
        }
        if (a == 0) {
            gcd = b;
        }else{
            gcd = a;
        }
        System.out.println(gcd);
    }
}
