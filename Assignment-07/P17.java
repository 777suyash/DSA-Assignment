public class P17 {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,9};
        int k = 2;
        int count = 0;
        int ans=fun(arr,k,count,0);
        System.out.println(ans);
    }
    static int fun(int[] arr, int k, int count,int index){
        if (index == arr.length) {
            return count;
        }
        if (arr[index] % k == 0) {
            count++;
        }
        return fun(arr,k,count,index+1);
    }
}
