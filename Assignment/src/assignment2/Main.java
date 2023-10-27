package assignment2;

public class Main {

	public static void main(String[] args) {
Account a=new Account(102,"Raju",25000f);
Account a1=new Account(102,"Raju",55000f);

AccountOperations.deposite(a, 5000);



AccountOperations.withDraw(a1, 10000);

AccountOperations.transferFunds(a1, a, 10000f);


System.out.println("Banking details for customer 1:");
System.out.println("new balance for a:"+a.getAccountBalance());
System.out.println("new balance for a1:"+a1.getAccountBalance());
System.out.println("new balance for a1:"+a1.getAccountBalance());
System.out.println("new balance for a:"+a.getAccountBalance());


	}

}
