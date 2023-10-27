package ArrayProblems;

public class SeparateArrayprob {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
	int evencount=0;
	int oddcount=0;
	
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			evencount++;
		}else {
			oddcount++;
		}
	}
	
	int [] evenArray=new int[evencount];
	int [] oddArray=new int[oddcount];
	
	int evenIndex=0;
	int oddIndex=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			evenArray[evenIndex]=a[i];
			evenIndex++;
		}else {
			oddArray[oddIndex]=a[i];
			oddIndex++;
		}
	}
	System.out.println("Even numbers from Array are...... ");
	for(int i=0;i<evenArray.length;i++) {
		System.out.print(evenArray[i]+" ");
	}
	
	System.out.println("\nOdd numbers from array are....");
	for(int i=0;i<oddArray.length;i++) {
		System.out.print(oddArray[i]+" ");
	}
	}
	
}

