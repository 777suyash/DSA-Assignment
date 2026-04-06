public class P3 {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3,2};
        int target = 2;
        int ans = fun(arr,target,0,0);
        System.out.println(ans);
    }
    static int fun(int[] arr, int target,int count,int i){
        if (i == arr.length) {
            return count;
        }
        if (arr[i] == target) {
            count++;
        }
        return fun(arr,target,count,i+1);
    }
}