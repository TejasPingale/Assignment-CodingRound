package assignment2;

public class Account {
private int accountNo;
private String accountName;
private float accountBalance;

public Account() {
	
}

public Account(int accountNo, String accountName, float accountBalance) {
	super();
	this.accountNo = accountNo;
	this.accountName = accountName;
	this.accountBalance = accountBalance;
}

public int getAccountNo() {
	return accountNo;
}

public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}

public String getAccountName() {
	return accountName;
}

public void setAccountName(String accountName) {
	this.accountName = accountName;
}

public float getAccountBalance() {
	return accountBalance;
}

public void setAccountBalance(float accountBalance) {
	this.accountBalance = accountBalance;
}


}
