public class P4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        boolean sort = fun(arr,0);
        System.out.println(sort);
    }
    static boolean fun(int[] arr, int i){
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return fun(arr,i+1);
    }
}
