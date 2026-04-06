public class P20 {
    public static void main(String[] args) {
        int[] arr = {9,7,5,2};
        boolean ans = fun(arr,0);
        System.out.println(ans);
    }
    static boolean fun(int[] arr, int index){
        if (index == arr.length-1) {
            return true;
        }
        if(arr[index] < arr[index+1]){
            return false;
        }
        return fun(arr, index+1);
    }
}
