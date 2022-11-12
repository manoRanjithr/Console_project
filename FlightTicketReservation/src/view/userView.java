package view;

import java.util.Map;
import java.util.Scanner;

import controller.UserController;
import model.DataBase;
import model.Flight;
import model.Passanger;
import model.User;

public class userView {
	static Scanner input=new Scanner(System.in);
	static int pnrGentrator=5777534;
	public static void login()
	{
		input.nextLine();
		System.out.println("--->WELCOME TO INDIAN AIRLINES-->");
		System.out.println("Enter your Id");
	try {
		int id=input.nextInt();
		User user=UserController.checkId(id);
		if(user!=null) 
		{
		outer:while(true)
		{
			System.out.println("Enter the option\n 1.BOOK TICKET \n2.CANCEL TICKET \n3.CHECK PNR STATUS");
			{
				byte option=App.input.nextByte();
				switch(option)
				{
				case 1:
					bookTicket();
					break;
				case 2:
					cancelTicket();
					break;
				case 3:
					checkPNRStatus();
					break outer;
					
				}
			}
		}
		}
		
		else {
			System.out.println("sign Up to continue");
			signUp();
		}
	}catch(Exception e) {};
	}
	private static void checkPNRStatus() {
		input.nextLine();
		System.out.println("Enter PNR_NO ");
		String PNR=input.nextLine();
		if(UserController.cheakPNRStatus(PNR)) {
			System.out.println("YOUR TICKET IS CONFIRMED \n");
		}
		else if(UserController.cheakPNRInrejection(PNR))
		{
			System.out.println("Your TICKET is Canceled BY Admin");
		}
		else 
		{
			System.out.println("PENDING...........");
		}
		
	}
	private static void cancelTicket() 
	{
		input.nextLine();
	 System.out.println("Enter the PNR");
	 String pnr=input.nextLine();
	 if(UserController.cancelTicket(pnr)) {
		 System.out.println("Your ticket is Cancelled");
	 }
	 else {
		 System.out.println("Enter correct PNR number");
	 }
	}

	private static void bookTicket()
	{
		showFlights();
		input.nextLine();
	    System.out.println("Enter how Many tickets");
	    int ticket=input.nextInt();
	    System.out.println("Enter FlightNumber ");
	    int  flightNumber=input.nextInt();
	    if(UserController.cheakavalability(flightNumber,ticket)) {
	    input.nextLine();
	    for(int i=1;i<=ticket;i++) {
	    System.out.println("Enter Passanger name "+i);
	    String name=input.nextLine();
	    System.out.println("Enter Passanger age ");
		int age=input.nextInt();
		System.out.println("Enter Passanger MailId ");
		input.nextLine();
		String mailId=input.nextLine();
		System.out.println("Enter Passanger phoneNumber ");
		String phoneNo=input.nextLine();
		Passanger newPasssanger=new Passanger (name,age,mailId,phoneNo,"PNR"+""+pnrGentrator,flightNumber,UserController.getTime(flightNumber));
		UserController.bookTicket(newPasssanger);
	
	    }
	    UserController.decreaseCapacity(flightNumber,ticket);
	    System.out.println("THANK YOU FOR CHOOSING INDIAN AIRLINES");
	    App.clickOption();
		}
	    else {
	    	System.out.println("There is No Avalability in this Flight "+flightNumber);
	    }
	}
	private static void showFlights() {
		for(Map.Entry<Integer, Flight> flight:DataBase.flightDetials.entrySet()) 
		{
		  System.out.println("Flight Number     "+flight.getKey());	
		  System.out.println("Available Seat    "+flight.getValue().getCapacity());		
		  System.out.println("DepatureLocation  "+flight.getValue().getDepatureLocation());		
		  System.out.println("Destination       "+flight.getValue().getDestination());		
		  System.out.println("Depature Time     "+flight.getValue().getTime());		
		}
	
	}
	public static void signUp() {
	   input.nextLine();
	   System.out.println("Enter the Name");
	   String name=input.nextLine();
	   System.out.println("Enter Age");
	   int age=input.nextInt();
	   input.nextLine();
	   System.out.println("Enter  MailId");
	   String mailId=input.nextLine();
	   System.out.println("Enter phoneNo");
	   String phoneNo=input.nextLine();
	   int id= UserController.addToDatabase(name,age,mailId,phoneNo);	
	   System.out.println("Your Coustermer ID: "+id);
	   login();
	} 

}