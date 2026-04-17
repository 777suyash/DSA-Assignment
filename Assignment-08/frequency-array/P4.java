public class P4 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        int max = arr[0];
        for (int i = 0 ; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int new_arr[] = new int[max+1];
        for (int i = 0 ; i < arr.length; i++ ) {
            new_arr[arr[i]]++;
        }
        for (int i = 0; i < new_arr.length; i++) {
            if (new_arr[i] == 1) {
                System.out.println(i);
            }
        }
    }
}
