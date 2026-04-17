public class P7 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        int max_fre = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if (max_fre < arr[i]) {
                max_fre = arr[i];
            }
        }
        int[] new_arr = new int[max_fre+1];
        for (int i = 0; i <arr.length; i++){
            new_arr[arr[i]]++;
        }
        
        int max = 0;
        int max_element = arr[0];
        int second = 0;
        int second_element = arr[0];
        for (int i = 0; i <new_arr.length; i++) {
            if (max < new_arr[i]) {
                second = max;
                second_element = max_element;
                max = arr[i];
                max_element = i;
            }
            if (i > second && max_element != new_arr[i]) {
                second = i;
                second_element = new_arr[i];
            }
        }
        System.out.println(second_element);
    }
}
