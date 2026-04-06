public class P18 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        boolean ans = fun(arr,0);
        System.out.println(ans);
    }
    static boolean fun(int arr[], int index){
        if (arr.length == index) {
            return true;
        }
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == arr[index] && index != i) {
        //         return false;
        //     }
        // }
        boolean answer = gun(arr[index],arr,index,0);
        if (answer == false) {
            return false;
        }
        return fun(arr, index+1);
    }
    static boolean gun(int n,int[] arr,int index, int i){
        if (arr.length == i) {
            return true;
        }
        if (n == arr[i] && index != i) {
            return false;
        }
        return gun(n, arr, index, i+1);
    }
}
