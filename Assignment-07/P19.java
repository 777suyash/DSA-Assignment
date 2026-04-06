public class P19 {
    public static void main(String[] args) {
        int arr[] = {12,34,5};
        int sum = 0;
        int ans = fun(arr,sum,0);
        System.out.println(ans);
    }
    static int fun(int arr[] , int sum , int index){
        if (index == arr.length) {
            return sum;
        }
        int n = arr[index];
        while (n != 0) { 
            sum += n%10;
            n/=10;
        }
        // sum = gun(n,sum);
        return fun(arr,sum,index+1);
    }
    // static int gun(int n,int sum){
    //     if (n == 0) {
    //         return sum;
    //     }
    //     sum+=n%10;
    //     n/=10;
    //     return gun(n,sum);
    // }
}
