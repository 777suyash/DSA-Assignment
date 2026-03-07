class P4{
	public static void main(String srgs[]){
		int n = 121;
		int num = n;
		int rev = 0;	
		while(n != 0){
			int temp = num%10;
			rev = rev*10+temp;
			num/=10;
		}
		if(n == rev){
			System.out.println("this is palindrome");	
		}else{
			System.out.println("this is not a palindrome");
		}
	}
}