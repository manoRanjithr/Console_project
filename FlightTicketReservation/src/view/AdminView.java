package view;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import controller.AdminController;
import model.DataBase;
import model.Passanger;

public class AdminView {
Scanner input=new Scanner(System.in);
	public void adminOption() 
	{
		outer:while(true)
		{
			System.out.println("Enter the option\n1.ADDFLIGHT\2.REMOVE FLIGHT\n3.SHOWREQUEST\4.EXIT");
			{
				byte option=App.input.nextByte();
				switch(option)
				{
				case 1:
					addflight();
					break;
				case 2:
					removdeFlight();
					break;
				case 3:
					showRequest();
				case 4:
					break outer;
					
				}
			}
	}

}
	private void showRequest() 
	{
		System.out.println(DataBase.request.size());
	 
		  outer:for(Map.Entry<String, Passanger> request:DataBase.request.entrySet()) 
		  {
			  System.out.println(request.getKey());
			  viewPasangersDetials(request);
			  System.out.println("Enter  1.CONFIRM 2.CANCEL 3.NEXTREQUEST");
			  int option=input.nextInt();
			  switch(option) {
			  case 1:
				  AdminController.addToBooking(request.getValue());
				  break;
			  case 2:
				  AdminController.addToCancelData(request.getKey());
				  DataBase.request.remove(request.getKey());
				  break;
			  case 3:
				  continue;
			  default:
				  break outer;  
			  }
		  }
	  }
	private void viewPasangersDetials(Entry<String, Passanger> request)
	{
	 System.out.println("Passanger Name     : "+request.getValue().getName());	
	 System.out.println("Passanger Age      : "+request.getValue().getAge());
	 System.out.println("Passanger MailId   : "+request.getValue().getMailId());
	 System.out.println("Passanger MObile_No: "+request.getValue().getPhoneNo());
	}
	private void removdeFlight()
	{
		System.out.println("Enter the flightNumber");
		int flightNumber=input.nextInt();
		if(AdminController.remmoveFlight(flightNumber)) {
			System.out.println(flightNumber+" is deleted");
		}
		else {
			System.out.println("There is no Flight have this Number"+flightNumber);
		}
		
	}
	private void addflight() 
	{
		
		System.out.println("Enter the flightNumber");
		int flightNumber=input.nextInt();
		System.out.println("Enter the depatureLocation");
		input.nextLine();
		String depatureLocation=input.nextLine();
		System.out.println("Enter the  destination");
		String destination=input.nextLine();
		System.out.println("Enter the  time");
		String  time=input.nextLine();
		System.out.println("Enter the Capacity");
		int capacity=input.nextInt();
		AdminController.addFlight(flightNumber,depatureLocation,destination,time,capacity);
	}
	
}
