class P5{
    public static void main(String[] args) {
        int arr[] = {2,4,6};
        boolean even = fun(arr,0);
        System.out.println(even);
    }
    static boolean fun(int[] arr,int index){
        if (index == arr.length) {
            return true;
        }
        if (arr[index] % 2 == 1) {
            return false;
        }
        return fun(arr, index+1);
    }
}