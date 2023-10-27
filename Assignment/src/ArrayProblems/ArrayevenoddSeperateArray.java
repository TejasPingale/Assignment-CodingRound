package ArrayProblems;

import java.util.Scanner;

public class ArrayevenoddSeperateArray {

	public static void main(String[] args) {
		System.out.println("Please enter array size:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Pls enter array element");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		//int a[]= {34,45,64,78,100};
		int counteven=0;
		int countodd=0;
		
		for (int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				counteven++;
			}else {
				countodd++;
			}
		}
		int evenArr []=new int[counteven];
		int oddArr[]=new int[countodd];
		
		int evenIndex=0;
		int oddIndex=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				
				evenArr[evenIndex]=a[i];
				evenIndex++;
			}else {
				
			oddArr[oddIndex]=a[i];
			oddIndex++;
			}
		}
		System.out.println("Even numbers from Array are:");
		for(int i=0;i<evenArr.length;i++) {
			System.out.print(evenArr[i]+" ");}
		
		System.out.println("\nOdd numbers from Array are:");
		for(int i=0;i<oddArr.length;i++) {
			System.out.print(oddArr[i]+" ");
		}
			
		
		
		
	}
}
