package ArrayProblems;

import java.util.Scanner;

public class ArraySorting {
	public static void main(String[] args) {
		System.out.println("Please enter array size:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
System.out.println("Please enter array elements:");
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		//int a[] = {1,5,3,8,4};
		int temp;
		int size=a.length;
		System.out.println("Original array :");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}

		for (int i=0;i<a.length-1;i++) {
			for (int j=i+1; j<a.length;j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println();
		
		System.out.println("Arrays after sorting:");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("\nSencond max number in array is:" +a[size-1]);
		System.out.println("\nSencond min number in array is:"+a[0+1]);
		System.out.println("size of array"+size);
		System.out.println("3rd min number :"+a[0+2]);
		System.out.println("3rd highest number:"+a[size-3]);
		System.out.println("2nd min number:"+a[0+1]);
		System.out.println("print the middle element from array which is already sorted:"+(a[size/2]));
		System.out.println("print the left of middle element from array which is already sorted:"+(a[(size/2)-1]));
		System.out.println("print the immediate right of middle element from array which is already sorted:"+(a[(size/2)+1]));
		System.out.println("print the 2nd left of middle element from array which is already sorted:"+(a[(size/2)-2]));
		System.out.println("print the 2nd right of middle element from array which is already sorted:"+(a[(size/2)+2]));
	}
}
