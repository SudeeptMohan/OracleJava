package BankingApp;

import java.util.Scanner;

public class BankAtm {
	
	public static void main(String [] args) {
		
		boolean success;
		String accountHolderName = "alex";
		String password = "password1";
		
		Accounts a = new Accounts();
		
		success = a.login (accountHolderName, password);

		if (success)
			{	
				int i;
				boolean flag = true;
				System.out.println("You are successfully logged in");
				while (flag == true) {
					
				
				System.out.println("Select a number");
				System.out.println("1.Check your balance");
				System.out.println("2.Make a deposit");
				System.out.println("3.Make a withdrawal");
				System.out.println("4.View previous transaction");
				System.out.println("5.Calculate interest");
				System.out.println("6.Exit");
				Scanner sc = new Scanner(System.in);
				i = sc.nextInt();		
				switch(i) {
				
				case 1: 
					a.checkBalance();
					break;
					
				case 2:
					System.out.println("How much deposit do you want to make?");
					int deposit = sc.nextInt();
					a.makeDeposit(deposit);
					a.checkBalance();
					break;
				
				case 3:
					System.out.println("How much money do you want to withdraw");
					int withdrawal = sc.nextInt();
					a.makeWithdrawal(withdrawal);
					a.checkBalance();
					break;
					
				case 4:
					System.out.println("Previous Transaction: "+a.prevTransaction());
					break;
				case 5:
					System.out.println("Interest = "+ a.calculateInterest());
					break;
				case 6:
					System.out.println("Thank you for banking with us.");
					flag = false;
					sc.close();
					break;
					
				}
				
			}
				
			}
		else
			System.out.println("Invalid login credentials");
		
		
	}
	
}

