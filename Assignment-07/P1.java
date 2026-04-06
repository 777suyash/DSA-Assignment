class P1{
    public static void main(String[] args) {
        int[] arr = {5,2,3,2,4};
        int n = 2;
        int target = fun(arr,0,n);
        System.out.println(target);
    }
    static int fun(int[] arr,int i,int n){
        if (i == arr.length) {
            return -1;
        }
        if (n == arr[i]) {
            return i;
        }
        return fun(arr, i+1 , n);
    }
}