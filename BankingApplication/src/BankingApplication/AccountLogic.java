package BankingApplication;

import java.util.ArrayList;
import java.util.Scanner;
public class AccountLogic {
	  static int account=1221;
	   static byte withdrawCheak=0;
	  static ArrayList<AccountDetials> list=new ArrayList<>();
	  Scanner input=new Scanner(System.in);
	public void openAccount() {
		   
		   System.out.println("Enter your Name");
		   String userName=input.nextLine();
		   System.out.println("Enter your Password");
		   int pass=input.nextInt();
		   double balance;
		   while(true) {
		   System.out.println("please Deposit minimum amount of 500");
		   balance=input.nextDouble();
		   if(balance>=500) {
			   list.add(new AccountDetials(userName,pass,account,balance));

			   System.out.println("This is your Account Number "+account++);
			  
			   break;
		   }
		   else 
		   {
			   if(withdrawCheak<1) {
				   withdrawCheak++;
			   System.out.println("Enter minimum 500");
		   }
			   else {
				   System.out.println("Maximum attempt reached");
				   System.out.println("Thank You!!!");
				   break;
			   }
		   }
		   }
		   input.nextLine();
		   input.nextLine();

	   }
	   public void showAccount()
	   {
		System.out.println("enter your account Number");
		int number=input.nextInt();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAccount_No()==number)
			{
			System.out.println("WELCOME  "+list.get(i).getName());
			System.out.println("Enter the password");
			int pass=input.nextInt();
			if(list.get(i).getPassword()==pass) 
			{
		
				System.out.println("Your Account Number "+list.get(i).getAccount_No());
				System.out.println("Your Balance "+list.get(i).getBalance());
				System.out.println();
			}
			else 
			{
				System.out.println("Enter the valid Password");
			}
			}
		}
		input.nextLine();
	   }
	public void withDraw() 
	{
		System.out.println("enter your account Number");
		int number=input.nextInt();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAccount_No()==number)
			{
			System.out.println("WELCOME  "+list.get(i).getName());
			System.out.println("Enter the password");
			int pass=input.nextInt();
			if(list.get(i).getPassword()==pass) 
			{while(true) {
		        System.out.println("Enter the amount");
				double amount=input.nextDouble();
				if(amount<=list.get(i).getBalance())
				{
				double Balance=list.get(i).getBalance();
				double value=Balance-amount;
				list.get(i).setBalance(value);
				System.out.println("your balance  "+list.get(i).getBalance());
				break;
				}
				else 
				{
					if(withdrawCheak<=2) 
					{
					System.out.println("Insufficent fund");
					withdrawCheak++;
					}
					else {System.out.println("Maximum attempt reached");break;}}
				}
			}
			else 
			{
				System.out.println("Enter the valid Password");
			}
		    }
	   }	
	}

	public void deposit() {
		System.out.println("enter your correct account Number");
		int number=input.nextInt();
		int cheak=0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAccount_No()==number)
			{
			System.out.println("WELCOME  "+list.get(i).getName());
			System.out.println("Enter the password");
			int pass=input.nextInt();
			if(list.get(i).getPassword()==pass) 
			{
		        System.out.println("Enter the amount");
				double amount=input.nextDouble();
			
				double Balance=list.get(i).getBalance();
				double value=Balance+amount;
				list.get(i).setBalance(value);
				System.out.println("your balance"+list.get(i).getBalance());
			}
			else 
			{
				System.out.println("Enter the valid Password");
			}
			}
		    }
	}
}
