package codinground;

public class ReverseWord {
public static void main(String[] args) {
	String str="java world";
	     String splitArray[]=str.split(" ");
	     
	     for(int i=splitArray.length-1;i>=0;i--) {
	    	 System.out.print(splitArray[i]+" ");
	     }
}
}
