package BankingApp;

import java.util.HashMap;

public class Accounts{

	private double balance;
	private String prevTransaction;
	private double deposit;
	private double withdrawal;
	int transactionFlag = 0;
	private double interest;
	
	void checkBalance() {
			System.out.println("Your balance is " + balance);
	}
	
	public void makeDeposit(double deposit) {
		this.deposit = deposit;
		transactionFlag = 1;
		balance += deposit;
		
		System.out.println("Deposit successful");
		
	}
	
	public double calculateInterest() {
		interest = balance*0.04;
		return interest;
	}
	
	public void makeWithdrawal(double withdrawal) {
		if (balance > withdrawal)
		{	
			this.withdrawal = withdrawal;
			transactionFlag = 2;
			balance-=withdrawal;
			
			System.out.println("Withdrawal successful");
			
		}
		
		else 
			System.out.println("low balance, withdrawal can't be made");

	}
	public String prevTransaction()
	{	if(transactionFlag ==0)
		prevTransaction = "No previous transactions";
		if (transactionFlag == 1)
		prevTransaction ="deposit "+ deposit ;
		if (transactionFlag == 2)
		prevTransaction ="withdrawal "+ withdrawal ;
		
		return prevTransaction;
	}
	
	public boolean login(String accountHolderName, String password) {
		HashMap <String,String> accountHolderInfo = new HashMap<String,String> ();
		boolean returnValue = false;
		accountHolderInfo.put("alex", "password1");
		accountHolderInfo.put("John", "password2");
		accountHolderInfo.put("Billy", "password3");
		
		for (String i : accountHolderInfo.keySet())
		{
			if (i == accountHolderName)
			{
				if (password == accountHolderInfo.get(i))
				{
					returnValue = true;
				}
			}
		}
		return returnValue;
	}
}
