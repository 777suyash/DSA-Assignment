public class P5 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3};
        int[] new_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j <arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count ==1) {
                new_arr[i] = arr[i];
            }
        }
        for (int i = 0; i < new_arr.length; i++) {
            if (new_arr[i] != 0) {
                System.out.println(new_arr[i]);
            }
        }
    }
}
