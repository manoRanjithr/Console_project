package model;

public class Flight {
	private int flightNumber;
	private String depatureLocation;
	private String destination;
	private String time;
	private int capacity;
	public Flight(int flightNumber,String depatureLocation,String destination,String time,int capacity) 
	{
		this.flightNumber=flightNumber;
		this.depatureLocation=depatureLocation;
		this.destination=destination;
		this.time=time;
		this.capacity=capacity;
		
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDepatureLocation() {
		return depatureLocation;
	}
	public void setDepatureLocation(String depatureLocation) {
		this.depatureLocation = depatureLocation;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	} 
}