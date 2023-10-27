package ArrayProblems;

public class ArraySumEvenCount {
	public static void main(String[] args) {
		int a[]= {34,45,64,78,100};
		int counteven=0;
		int countodd=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				
				counteven++;
			}else {
				
				countodd++;
			}
		}
		System.out.println(counteven);
		System.out.println(countodd);
		
		
		
	}
}
