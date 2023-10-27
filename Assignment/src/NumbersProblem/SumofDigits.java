package NumbersProblem;

import java.util.Scanner;

public class SumofDigits {
public static void main(String[] args) {
	System.out.println("Please enter numbers:");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	
	int count=0;
	int sum=0;
	while(x!=0) 
	{
		int y=x%10;
		sum=sum+y;
		x=x/10;
		count++;
	}
	System.out.println(sum);
}
}
