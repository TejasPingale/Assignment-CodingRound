package NumbersProblem;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	System.out.println("Please enter number to know is this armstrong or not:");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int onum=num;
	int cnum=num;
	int remainder;
	int result=0;
	int count=0;
	while(cnum >0) {
		cnum=cnum/10;
		count++;
	}
	
	while(onum!=0) {
		remainder=onum%10;
		result=(int) (result+Math.pow(remainder, count));
		onum=onum/10;
	}
	
	if(result==num) {
		System.out.println("Given number armstrong number ");
		
	}else {
		System.out.println("given number is not armstrong number");
	}
}
}

