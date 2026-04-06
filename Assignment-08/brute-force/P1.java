class P1{
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,4};
        int max = arr[0];
        int max_fre = 0;
        int second = arr[0];
        int second_fre = 0;

        for (int i = 0 ; i <arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max_fre) {
                second_fre = max_fre;
                second = max;
                max_fre = count;
                max = arr[i];
            }
            if (count < second_fre && max != count) {
                second_fre = count;
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}