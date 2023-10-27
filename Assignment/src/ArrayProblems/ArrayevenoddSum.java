package ArrayProblems;

public class ArrayevenoddSum{

	public static void main(String[] args) {
		int a[]= {34,45,64,78,100};
		int sumeven=0;
		int sumodd=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sumeven=sumeven+a[i];
			}else {
				sumodd=sumodd+a[i];
			}
		}
		System.out.println(sumeven);
		System.out.println(sumodd);
		
		
		
	}
}
