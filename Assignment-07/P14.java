public class P14 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 3;
        boolean ans = fun(arr,target,0);
        System.out.println(ans);
    }
    static boolean  fun(int arr[] , int target ,int index){
        if(index == arr.length){
            return false;
        }
        if (target == arr[index]) {
            return true;
        }
        return fun(arr,target,index+1);
    }
    
}
