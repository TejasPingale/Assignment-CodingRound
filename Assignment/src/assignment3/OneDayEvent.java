package assignment3;

public class OneDayEvent extends Event {
private int hours;
private int ratePerHours;
private int extraHours;
public OneDayEvent() {
	super();
}

public OneDayEvent(int eventId, String eventName, float baseFare, int hours, int ratePerHours, int extraHours) {
	super(eventId, eventName, baseFare);
	this.hours = hours;
	this.ratePerHours = ratePerHours;
	this.extraHours = extraHours;
}

public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
public int getRatePerHours() {
	return ratePerHours;
}
public void setRatePerHours(int ratePerHours) {
	this.ratePerHours = ratePerHours;
}
public int getExtraHours() {
	return extraHours;
}
public void setExtraHours(int extraHours) {
	this.extraHours = extraHours;
}
@Override
public float getTotalFare() {
	int hourlyFare=hours*ratePerHours;
	//assume rate per hours is rs.500/-
	int extraHourFare=extraHours*500;
	float totalFare=super.getTotalFare()+hourlyFare+extraHourFare;
	return totalFare;
	
}

}
