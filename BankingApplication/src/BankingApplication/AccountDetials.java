package BankingApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountDetials {
   Scanner input=new Scanner(System.in);
 
   private String Name;
   private int Account_No;
   private double Balance;
   private int password;
 
	//static int count=1221;
	 public AccountDetials(String name,int pass,int count,double Balance)
	 {
		  this.Account_No=count;
		  this.Name=name;
		  this.password=pass;
		  this.Balance=Balance;
	 }
	 
   public void setName(String name) {
		Name = name;
	}

	public void setAccount_No(int account_No) {
		Account_No = account_No;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public void setPassword(int password) {
		this.password = password;
	}

public String getName() {
		return Name;
	}

	public int getAccount_No() {
		return Account_No;
	}

	public double getBalance() {
		return Balance;
	}

	public int getPassword() {
		return password;
	}


   }	
	

