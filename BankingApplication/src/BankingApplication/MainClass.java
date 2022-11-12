package BankingApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		AccountLogic user=new AccountLogic();
		Scanner input=new Scanner(System.in);
		int i=0;
			System.out.println("1.open new Account\n2.BalanceEnquiry\n3.withDraw \n4.Deposit\n5.Exit");
			
			try{
				byte option=input.nextByte();
			if(option==1)
			{
				user.openAccount();
			}
			if(option==2)
			{
				user.showAccount();
			}
			if(option==3)
			{
				user.withDraw();
			}
			if(option==4) 
			{
				user.deposit();
			}
			if(option==5) {
				System.out.println("Thank you!!!");
			}
			else {
				System.out.println("Enter your option");
				main(args);
			}
		}
		catch(Exception e) {main(args);};
		}
	}

