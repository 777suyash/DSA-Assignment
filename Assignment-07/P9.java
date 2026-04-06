public class P9 {
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int sum = 0;
        int ans = fun(arr,sum,0);
        System.out.println(ans);
    }
    static int fun(int[] arr, int sum, int index){
        if (index == arr.length) {
            return sum;
        }
        if (index % 2 == 1) {
            sum+=arr[index];
        }
        return fun(arr, sum, index+1);
    }
}
