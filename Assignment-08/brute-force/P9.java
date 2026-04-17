public class P9 {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,2,2,3,7};
        int[] arr2 = {1,1,2,2,2,3};

        for (int i = 0; i < arr1.length; i++) {
            int count = 0;
            for (int j =0 ; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(arr1[i]);
            }
        }
    }
}
