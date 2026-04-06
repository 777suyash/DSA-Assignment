public class P8 {
    public static void main(String[] args) {
        int[] arr = {3,9,1,7};
        int mini = arr[0];
        int ans = fun(arr,mini,0);
        System.out.println(ans);
    }
    static int fun(int[] arr, int mini,int index){
        if(index == arr.length){
            return mini;
        }
        if (arr[index] < mini) {
            mini = arr[index];
        }
        return fun(arr,mini,index+1);
    }
}
