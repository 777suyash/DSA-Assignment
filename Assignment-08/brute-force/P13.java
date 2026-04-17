public class P13 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            arr[i] = count;
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" " );
        }
    }
}
