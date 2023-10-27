package assignment1;

public class CateringBill {
private int plateCount;
private int ratePerPlate;
public CateringBill() {
	}
public CateringBill(int plateCount, int ratePerPlate) {
	super();
	this.plateCount = plateCount;
	this.ratePerPlate = ratePerPlate;
}
public int getPlateCount() {
	return plateCount;
}
public void setPlateCount(int plateCount) {
	this.plateCount = plateCount;
}
public int getRatePerPlate() {
	return ratePerPlate;
}
public void setRatePerPlate(int ratePerPlate) {
	this.ratePerPlate = ratePerPlate;
}

public  int generateBill() {
	int bill=plateCount*ratePerPlate;
	return bill;
	
}
public int generateBill(int discount) {

int bill=generateBill();
int disBill=bill*discount/100;
int finalBill=bill-disBill;
return finalBill;
}


}
