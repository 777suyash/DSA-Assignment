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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[index] && index != i) {
                return false;
            }
        }
        return fun(arr, index+1);
    }
}
