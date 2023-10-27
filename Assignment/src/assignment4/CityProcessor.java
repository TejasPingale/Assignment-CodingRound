package assignment4;

public class CityProcessor 
{

	public static float getAvgPopulation(City [] cities) {
		int cityCount=cities.length;
		int totalPopulation=0;
		
		for(City city:cities) {
			int population=city.getPopulation();
			totalPopulation=totalPopulation+population;
		}
		float avgPopulation=(float)totalPopulation /cityCount;
		return avgPopulation;
		
	     }
	
	public static String[] getBigCityNames(City[] cities) {
		int cityCount=cities.length;
	    String bigCities[]=new String[cityCount];
	    int index=0;
	    
	    for(City city:cities) {
	    	int population=city.getPopulation();
	    	if(population>40) {
	    		String name=city.getName();
	    	    bigCities[index]=name;
	    	    index++;
	    	}
	    }
	  return bigCities;
	
	}
}
