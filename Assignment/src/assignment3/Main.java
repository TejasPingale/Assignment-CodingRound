package assignment3;

public class Main {

	public static void main(String[] args) {

		Event e1=new OverNightEvent(1,"Marriage", 10000, 4, 25000,10,500);
		Event e2=new OneDayEvent(2, "ENgagement",55000,4,5500,1);
		
		float totalFare1=e1.getTotalFare();
		float totalFare2=e2.getTotalFare();
		
		System.out.println("Details:");
		
		System.out.println("Event Name:"+e1.getEventName());
		System.out.println("Total Fare:"+totalFare1);
		
		System.out.println("-----------------------------");
		System.out.println("Event Name:"+e2.getEventName());
		System.out.println("Total Fare:"+totalFare2);
			
		
		
	}

}
