public class P6 {
    public static void main(String args[]){
        int[] arr = {1,2,-3,4};
        boolean ans = fun(arr,0);
        System.out.print(ans);
    }
    static boolean fun(int[] arr, int index){
        if (index == arr.length) {
            return true;
        }
        if (arr[index] < 0) {
            return false;
        }
        return fun(arr, index+1);
    }
}
