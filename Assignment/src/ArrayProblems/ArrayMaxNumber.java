package ArrayProblems;

import java.util.Scanner;

public class ArrayMaxNumber {
public static void main(String[] args) {
	
	//int [] a= {10,50,20,45,65,99,1225,022};
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter sixze of array");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Please enter array elements:");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	int min=a[0];
	
	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println(min);
	
}
	
}