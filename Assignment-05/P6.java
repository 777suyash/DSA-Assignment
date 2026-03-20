public class P6 {
    public static void main(String args[]){
        int n = 153;
        int num = n;
        int num_digit = 0;
        int sum = 0;
        while (num != 0) { 
            num/=10;
            num_digit++;
        }
        while (n != 0) { 
            int temp = n%10;
            int power = 1;
            for (int i = 1; i <= num_digit; i++) {
                power*=temp;
            }
            sum+=power;
            n/=10;
        }
        System.out.println(sum);
    }
}
