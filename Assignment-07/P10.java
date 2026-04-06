public class P10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        boolean ans = fun(arr,0,arr.length-1);

        System.out.println(ans);
    }
    static boolean fun(int[] arr, int first_index,int last_index){
        if (first_index == last_index) {
            return true;
        }
        if (arr[first_index] != arr[last_index]) {
            return false;
        }
        return fun(arr, first_index+1, last_index-1);
    }
}
