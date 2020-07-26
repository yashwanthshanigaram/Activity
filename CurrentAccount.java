package com.Activity;

public class CurrentAccount implements Transaction{

	@Override
	public double withdraw(double amount,double balance) {
	if(amount>5000)
		{System.out.println("Withdraw Attempt Failed");return balance;}
	else if(balance<5000)
		{System.out.println("Insufficient Balance");return balance;}
	else
		{
		 balance=balance-amount;
		System.out.println("Available Balance: "+balance);
		 return balance;
		}

	}
	@Override
	public double deposit(double amount) {
	double balance=amount+InitialBalance;
	System.out.println("Available Balaance: "+balance);	
	return balance;
	}
	@Override
	public void balance() {

	}
	@Override
	public void customerDetails() {
}

}


