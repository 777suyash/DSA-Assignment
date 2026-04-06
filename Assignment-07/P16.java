

public class P16 {
    public static void main(String[] args) {
        int[] arr = {5,2,8,1,3};
        int mini = arr[0];
        int mini_index = 0;
        int ans = fun(arr,mini, mini_index,0);
        System.out.println(ans);
    }
    static int fun(int[] arr ,int mini,int mini_index, int index){
        if (arr.length == index) {
            return mini_index;
        }
        if (mini > arr[index]) {
            mini = arr[index];
            mini_index = index;
        }
        return fun(arr,mini,mini_index,index+1);
    }
}
