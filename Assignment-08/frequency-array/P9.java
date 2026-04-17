
public class P9 {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 2, 3, 7};
        int[] arr2 = {1, 1, 2, 2, 2, 3};

        int max1 =arr1[0];
        for(int i=0; i < arr1.length; i++){
            if (max1 < arr1[i]) {
                max1 = arr1[i];
            }
        }
        int max2 =arr1[0];
        for(int i=0; i < arr2.length; i++){
            if (max2 < arr2[i]) {
                max2 = arr2[i];
            }
        }
        int max = max1 > max2 ?  max1 :  max2;
        int new_arr[] = new int[max+1];

        for (int i = 0; i < arr1.length; i++) {
            new_arr[arr1[i]]++;
        }
         for (int i = 0; i < arr2.length; i++) {
            new_arr[arr2[i]]++;
        }

         for (int i = 0; i < new_arr.length; i++) {
            if (new_arr[i] == 1) {
                System.out.println(i);
            }
        }
    }
}
