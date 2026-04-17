class P1{
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4};
        int max_fre = 0;
        for (int i =0; i < arr.length; i++) {
            if (max_fre < arr[i]) {
                max_fre = arr[i];
            }
        }
        int[] fre_arr = new int[max_fre+1];
        for (int i = 0; i < arr.length; i++) {
            fre_arr[arr[i]]++;
        }
        int max_element = 0;
        int max = arr[0];
        int second_element = 0;
        int second = arr[0];

        for (int i = 0; i < fre_arr.length; i++) {
            if (max_element < fre_arr[i]) {
                second = max;
                second_element = max_element;
                max_element = fre_arr[i];
                max = i;
            }
            if (fre_arr[i] > second_element && fre_arr[i] != max_element) {
                second_element = fre_arr[i];
                second = i;
            }
        }
        System.out.println(second);
    }
}