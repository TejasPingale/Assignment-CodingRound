package NumbersProblem;

import java.util.ArrayList;

public class Primenum1to100 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	
	for(int n=50;n<=100;n++) {
		int c=0;
		for(int i=1;i<=	n;i++) 
			if(n%i==0) {
				c++;}
			
			if(c==2) {
				al.add(n);
			}
			
			
				else {
				
				continue;}
			
		}
		
	
	System.out.println(al);
}
}
