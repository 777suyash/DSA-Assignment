public class P2 {
    public static void main(String[] args) {
        int[] arr ={5,2,3,2,4};
        int n = 2;
        int target = fun(arr,n,0);
        System.out.println(target);
    }
    static int fun(int[] arr,int n, int i){
        if (i == arr.length) {
            return -1;
        }
        int right = fun(arr, n, i+1);
        if (right != -1) {
            return right;
        }
        if (arr[i] == n) {
            return i;
        }
        return -1;
    }
}
