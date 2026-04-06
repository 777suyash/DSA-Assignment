public class P11 {
    // public static void main(String[] args) {
    //     int[] arr = {10,5,8,20,15};
    //     int max_element = arr[0];
    //     for (int  i = 0; i < arr.length; i++) {
    //         if (arr[i] > max_element) {
    //             max_element = arr[i];
    //         }
    //     }
    //     int second_element = arr[0];
    //     int ans = fun(arr,max_element,second_element,0);
    //     System.out.println(ans);
    // }
    // static int fun(int arr[],int max_element,int second_element, int index){
    //     if (index == arr.length) {
    //         return second_element;
    //     }
    //     if (second_element < arr[index] && arr[index] != max_element) {
    //         second_element= arr[index];
    //     }
    //     return fun(arr, max_element,second_element, index+1);
    // }

    public static void main(String[] args) {
        int[] arr = {10,5,8,20,15};  
        int max_element = arr[0];
        int second_element = arr[0];
        int ans = fun(arr,max_element,second_element,0);
        System.out.println(ans);
    }
    static int fun(int arr[],int max_element,int second_element, int index){
        if (index == arr.length) {
            return second_element;
        }
        if (max_element < arr[index]) {
            second_element = max_element;
            max_element = arr[index];
        }
        if (second_element < arr[index] && arr[index] < max_element) {
            second_element= arr[index];
        }
        return fun(arr, max_element,second_element, index+1);
    }
}
