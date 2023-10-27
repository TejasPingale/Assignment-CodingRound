package ArrayProblems;

public class Arraysum {
public static void main(String[] args) {
	int a[]= {34,45,64,78,100};
	int sum=0;
	
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	System.out.println(sum);
}
}
