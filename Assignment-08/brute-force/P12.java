public class P12 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,5};
        int fre_arr1[] = new int[arr.length];
        int fre_arr2[] = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                fre_arr1[i] = arr[i];
            }else if(count == 2){
                boolean a = false;
                for (int t = 0; t < fre_arr2.length; t++) {
                    if (fre_arr2[t] == arr[i]) {
                        a = true;
                    }
                }
                if (a == false) {
                    fre_arr2[i] = arr[i]; 
                }
            }

        }
        for (int i = 0; i < fre_arr1.length; i++) {
            if (fre_arr1[i] != 0) {
                System.out.print(fre_arr1[i]+" ");
                
            }
        }
        System.out.println("");
        for (int i = 0; i < fre_arr2.length; i++) {
            if (fre_arr2[i] != 0) {
                System.out.print(fre_arr2[i]+" ");
                
            }
        }
    }
}
