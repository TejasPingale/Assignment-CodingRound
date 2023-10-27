package ArrayProblems;

import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args) {
        
        int a[]= {10,50,67,35,80};
        int size=a.length;
        System.out.println("Original array:");
        for(int i=0;i<a.length;i++) {
        	System.out.print(a[i]+" ");
        }
        
        for(int i=a.length-1;i>0;i--) {
        	//System.out.print(a[i]);
        }
        
        System.out.println("\nreverse of an array:");
        for(int i=a.length-1;i>0;i--) {
        	System.out.print(+a[i]+" ");
        }
        System.out.println("\nMiddle of an array:"+a[(size/2)]);
        
        for(int i=0;i<a.length;i++) {
        	for(int j=i+1;j<a.length;j++) {
        		if(a[i]>a[j]) {
        		int temp;
        		temp=a[i];
        		a[i]=a[j];
        		a[j]=temp;
        	}
        }
    }
        System.out.println("Sorted array is:");
        for(int i=0;i<a.length;i++) {
        	System.out.print(a[i]+" ");
        }
}
}