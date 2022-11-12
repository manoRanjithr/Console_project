package controller;

import model.DataBase;
import model.Passanger;
import model.User;

public class UserController {
	static DataBase dataBase = new DataBase();
    public static int addToDatabase(String name,int age,String mailId,String phoneNo) {
    	User newUser=new User(name,age,mailId,phoneNo);
		return dataBase.addUserDetials(newUser);
    }
	public static void bookTicket(Passanger newPasssanger) 
	{
		DataBase.addrequest(newPasssanger);
	}
	public static User checkId(int nextInt){
		 if(DataBase.userDetials.containsKey(nextInt)) {
			 return (DataBase.userDetials.get(nextInt));
		 }
		return null;
	}
	public static void addToRequest(Passanger newPasssanger)
	{
		dataBase.addPassanger(newPasssanger);	
	}
	public static boolean cheakPNRStatus(String pNR) {
		if(DataBase.passangerDetials.containsKey(pNR)) {
			return true;
		}
		return false;
	}
	public static boolean cheakPNRInrejection(String pNR) {
		return DataBase.Cancelledrequest.containsKey(pNR);
		
	}
	public static boolean cheakavalability(int flightNumber, int ticket) {
		
		if(DataBase.flightDetials.containsKey(flightNumber)){
			return DataBase.flightDetials.get(flightNumber).getCapacity()>=ticket;
		}
		return false;
	}
	public static void decreaseCapacity(int flightNumber, int ticket) {
		int capacity=DataBase.flightDetials.get(flightNumber).getCapacity()-ticket;
		DataBase.flightDetials.get(flightNumber).setCapacity(capacity);
	}
	public static String getTime(int flightNumber) {
		
		return DataBase.flightDetials.get(flightNumber).getTime();
	}
	public static boolean cancelTicket(String pnr) {
		if(DataBase.passangerDetials.containsKey(pnr)) {
			DataBase.passangerDetials.remove(pnr);
			return true;
		}
		return false;
		
	}
}