public class P7 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        int max = 0;
        int max_element =arr[0];
        int second = 0;
        int second_element = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (max < count) {
                second = max;
                second_element = max_element;
                max = count;
                max_element = arr[i];
            }
            if (count > second && max_element != arr[i]) {
                second = count;
                second_element = arr[i];
            }
        }
        System.out.println(second_element);
    }
}
