public class P7 {
    public static void main(String[] args) {
        int[] arr = {3,9,1,7};
        int max = arr[0];
        int ans = fun(arr,max,0);
        System.out.println(ans);
    }
    static int fun(int arr[],int max,int index){
        if (index == arr.length) {
            return max;
        }
        if (arr[index] > max) {
            max = arr[index];
        }
        return fun(arr, max, index+1);
    }
}
