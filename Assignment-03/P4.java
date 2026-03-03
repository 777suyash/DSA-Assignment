public class P4{
    public static void main(String[] args) {
        int n= 3;
        int col = 2*n -1;
        int row = 2*n -1;

        for(int i = 1; i <= col; i++){
            for(int j = 1; j <= row; j++){
                int top = i-1;
                int bottom = 2*n-1-i;
                int left = j - 1;
                int right = 2*n-1-j;
                int smallest = Math.min(Math.min(top, bottom), Math.min(left, right));
                int layer = smallest;
                System.err.print(n-layer+" ");
            }
            System.out.println("");
        }
    }
}