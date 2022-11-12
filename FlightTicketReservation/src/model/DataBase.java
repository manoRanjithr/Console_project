package model;

import java.util.HashMap;

public class DataBase {
	static public HashMap<Integer,User>userDetials=new HashMap<>();
	static public HashMap<Integer,Flight>flightDetials=new HashMap<>();
	static public HashMap<String,Passanger>request=new HashMap<>();
	static public HashMap<String,Passanger>Cancelledrequest=new HashMap<>();
	static public HashMap<String,Passanger>passangerDetials=new HashMap<>();
	public int addUserDetials(User user) 
	{
	  userDetials.put(user.getId(),user);	
	  System.out.println(userDetials);
	  return user.getId();
	}
	public void addFlight(Flight newFlight) {
		flightDetials.put(newFlight.getFlightNumber(),newFlight);
	}
	public static void addrequest(Passanger newPasssanger) {
		request.put(newPasssanger.getPNR(),newPasssanger);
	}
	public void addPassanger(Passanger passanger) {
		passangerDetials.put(passanger.getPNR(), passanger);
		
	}
	public void addPassangerInCanceledRequest(Passanger passanger) {
		Cancelledrequest.put(passanger.getPNR(), passanger);
		
	}
	

}
