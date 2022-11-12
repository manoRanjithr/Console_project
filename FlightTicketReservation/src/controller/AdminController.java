package controller;

import model.DataBase;
import model.Flight;
import model.Passanger;

public class AdminController {
static DataBase database=new DataBase();
	public static void addFlight(int flightNumber, String depatureLocation, String destination, String time,int capacity)
	{
		Flight newFlight=new Flight(flightNumber,depatureLocation,destination,time, capacity);
		database.addFlight(newFlight);
	}
	public static boolean remmoveFlight(int flightNumber) {
	   	if(DataBase.flightDetials.containsKey(flightNumber)) {
	   		DataBase.flightDetials.remove(flightNumber);
	   		return true;
	   	}
	   	return false;
	}
	public static void addToBooking(Passanger passanger) {
		database.addPassanger(passanger);
	}
	public static void addToCancelData(String PNR) {
		database.addPassangerInCanceledRequest(DataBase.request.get(PNR));
	
	}
}
