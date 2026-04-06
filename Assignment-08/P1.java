public class P1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        boolean ans = fun(arr,0);
        System.out.println(ans);
    }
    static boolean fun(int arr[], int index){
        if (arr.length == index) {
            return true;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[index] && index != i) {
                return false;
            }
        }
        // gun(arr,arr[index], 0);
        return fun(arr, index+1);
    }
    // static boolean gun(int[] arr,int n, int i){
    //     if (i == arr.length) {
    //         return true;
    //     }
    //     if (n == arr[i] && i != n) {
    //         return false;
    //     }
    //     return gun(arr, n, +1);
    // }
}
