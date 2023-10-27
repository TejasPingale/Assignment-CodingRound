package assignment1;

public class CateringMain {

	public static void main(String[] args) {
		CateringBill b1=new CateringBill(10,500);
		CateringBill b2=new CateringBill(1,1000);
		System.out.println("Bill for table no 1 is:");
		System.out.println("Your bill amount is:"+b1.generateBill());
		System.out.println("Your Discounted bill amount is:"+b1.generateBill(10));
		
		System.out.println("------------------------------------");
		System.out.println("Bill for table no 2 is:");
		System.out.println("Your bill amount is:"+b2.generateBill());
		System.out.println("Your Discounted bill amount is:"+b2.generateBill(12));
		
		

	}

}
