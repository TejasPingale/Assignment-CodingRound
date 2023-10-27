package assignment2;

public class AccountOperations {

	public static void deposite(Account acc,float amount){
		float currentBalance=acc.getAccountBalance();
		float newBalance=currentBalance+amount;
		acc.setAccountBalance(newBalance);
		
	}
	
	public static void withDraw(Account acc,float amount) {
		float currentBalance=acc.getAccountBalance();
		float newBalance=currentBalance-amount;
		acc.setAccountBalance(newBalance);
		
	}
	
	public static void transferFunds(Account acc,Account acc1,float amount) {
	  withDraw(acc,amount);	
	  deposite(acc1,amount);
	}
}
