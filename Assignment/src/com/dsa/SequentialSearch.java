package com.dsa;

import java.util.Scanner;

public class SequentialSearch {

	int a[];
	
	void createArray(int size) 
	{
		a=new int[size];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter "+size+"element");
	  for (int i=0;i<size;i++)
	  {
		  System.out.println("enter element at "+i);
		  a[i]=in.nextInt();
		  }
	}
	
	void printArray()
	{
		System.out.print("Elements in array ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
	
	
	int sequentialSearch(int key)
	{
		for (int i=0;i<a.length;i++)
		{
			if(key==a[i])
				return(i);
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		SequentialSearch obj=new SequentialSearch();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of element:");
		int size=in.nextInt();
		obj.createArray(size);
		obj.printArray();
		
		System.out.println("\nEnter element to search:");
		int e=in.nextInt();
		
		int res=obj.sequentialSearch(e);
		if(res==-1)
			System.out.println(+e+ "Not found");
		else
			System.out.println(e+"Found at position "+(res+1));
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
