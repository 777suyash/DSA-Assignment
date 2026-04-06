public class P13 {
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,2};
        int x = 3;
        int count = 0;
        int ans = fun(arr,count,x,0);
        System.out.println(ans);
    }
    static int fun(int[] arr, int count,int x, int index){
        if (arr.length == index) {
            return count;
        }
        if (arr[index] > x) {
            count++;
        }
        return fun(arr, count, x, index+1);
    }
}
