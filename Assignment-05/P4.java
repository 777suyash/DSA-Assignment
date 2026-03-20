class P4{
	public static void main(String srgs[]){
		int n = 121;
		int check = n;
		int rev = 0;
		while (check != 0) { 
			int temp = check%10;
			rev = rev * 10 + temp;
			check/=10;
		}
		if (n == rev) {
			System.out.println("Palindrome");
		}else{
			System.out.println("Not palindrome");
		}
	}
}