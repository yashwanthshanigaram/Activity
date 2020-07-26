package com.Activity;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the Account type: "+"\n"+"S for SavingsAccount"+"\n"+"C for CurrentAccount");
		System.out.println("Enter your choice: ");
		char ch=sc.next().charAt(0);
		int op;
		double balance=10000;
		char choice;
		if(ch=='S')
		{
		do
		{
		  SavingsAccount s=new SavingsAccount();
		  System.out.println("Choose your option"+"\n"+"1.Deposit"+"\n"+"2.Withdraw"+"\n"+"3.Balance");
		  op=sc.nextInt();
		switch(op)
		{
		case 1:
		System.out.println("Enter the Amount to deposit: ");
		double amount=sc.nextDouble();
		 balance=s.deposit(amount);
		break;
		case 2:System.out.println("Enter the Amount to withdraw: ");
		double withdralAmount=sc.nextDouble();
		balance=s.withdraw(withdralAmount,balance);
		break;
		case 3:s.balance();System.out.println("Available Balance is "+balance);
		break;
		default:System.out.println("Please enter 1/2/3 only...");
		}System.out.println("Do u want to continue ?");
		 choice=sc.next().charAt(0);
		 }while(choice=='y');	
		}else
		{
			do
			{
			CurrentAccount c=new CurrentAccount();
			System.out.println("Choose your option"+"\n"+"1.Deposit"+"\n"+"2.Withdraw"+"\n"+"3.Balance");
			op=sc.nextInt();
			switch(op)
			{
			case 1:
			System.out.println("Enter the Amount to deposit: ");
			double amount=sc.nextDouble();
			balance=c.deposit(amount);
			break;
			case 2:System.out.println("Enter the Amount to withdraw: ");
			double withdralAmount=sc.nextDouble();
			balance=c.withdraw(withdralAmount,balance);
			break;
			case 3:c.balance();System.out.println("Available Balance is "+balance);
			break;
			default:System.out.println("Please enter 1/2/3 only...");		
		    }System.out.println("Do u want to continue ?");
			 choice=sc.next().charAt(0);
			 }while(choice=='y');		
	    }sc.close();

		

	}

}
