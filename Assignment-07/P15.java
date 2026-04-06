public class P15 {
    public static void main(String args[]){
        int[] arr = {1,-2,3,-4,5};
        int sum = 0;
        int ans = fun(arr,sum,0);
        System.out.println(ans);
    }
    static int fun(int[] arr,int sum ,int index){
        if (index == arr.length) {
            return sum;
        }
        if (arr[index] < 0) {
            sum+=arr[index];
        }
        return fun(arr,sum,index+1);
    }
}
