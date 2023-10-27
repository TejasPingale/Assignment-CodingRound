package assignment4;

public class CityMain {

	public static void main(String[] args) {
  
		City c1=new City("pune",66);
		City c2=new City("mumbai",20);
		City c3=new City("Delhi",45);
		City c4=new City("Hydrabad",60);
		City c5=new City("Noida",35);
		City c6=new City("Kochi",88);
		
		City cities[]= {c1,c2,c3,c4,c5,c6};
		
		float avgPopulation=CityProcessor.getAvgPopulation(cities);
		System.out.println("Average Population:"+avgPopulation);
		
		System.out.println("Big City Names:");
		String bigCityNames[]=CityProcessor.getBigCityNames(cities);
		for(String bigCity:bigCityNames) {
			if(bigCity!=null) {
				System.out.println(bigCity);
			}
		}
	}

}
