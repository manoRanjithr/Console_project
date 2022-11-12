package CarParkingManagement;

public class CoustmerDetials {
	private String car_Number;
	private String Name;
	private int parkingFloor;
	private int parking_Number;
	public CoustmerDetials(String car_Number,String Name,int ParkingFloor,int parking_Number){
		this.car_Number=car_Number;
		this.Name=Name;
		this.parking_Number=parking_Number;
		this.parkingFloor=ParkingFloor;
		
	}
	public String getCar_Number() {
		return car_Number;
	}
	public String getName() {
		return Name;
	}
	public int getParkingFloor() {
		return parkingFloor;
	}
	public int getParking_Number() {
		return parking_Number;
	}
	

}
