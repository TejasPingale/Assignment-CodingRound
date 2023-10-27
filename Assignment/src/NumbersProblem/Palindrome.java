package NumbersProblem;

public class Palindrome {
public static void main(String[] args) {
	int n=455;

	int rev;
	int sum=0;
	int temp=n;
	while(n>0) {
		rev=n%10;
		sum=(sum*10)+rev;
		n=n/10;
		
	}
	if(temp==sum) {
		System.out.println("No is palindrome");
	}
	else {
		System.out.println("No is not palindrome");
	}
	
	System.out.println("Reverse number:"+sum);
}
}
