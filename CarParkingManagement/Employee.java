package CarParkingManagement;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Employee {
	public static ArrayList<CoustmerDetials > list=new ArrayList<>();
	static Scanner input = new Scanner(System.in);
	static ApplicationInterface go=new ApplicationInterface();
	public static void access(Floor obj) {
		
		CarParkingManagement back = new CarParkingManagement();
		
		System.out.println("1.update\n2.delete\n3.Back");
		try {
			int option = input.nextInt();
			if (option > 3)
				throw new IOException();

			if (option == 1) {
				try{System.out.println("floor number");
				int floorNum = input.nextInt();
				System.out.println("parkingnumber");
				int parkingNum = input.nextInt();
				input.nextLine();
				System.out.println("Enter Car number ");
				String carNumber= busNoValidate(input.nextLine());
				System.out.println("Enter Customer_Name ");
				String customerName=input.nextLine();
				obj.updateParking(floorNum, parkingNum,carNumber);
				list.add(new CoustmerDetials(carNumber,customerName,floorNum,parkingNum));
				}catch(Exception e) {access(obj);};
			} else if (option == 2) {
				System.out.println("Floor Number");
				int floorNum = input.nextInt();
				System.out.println("parkingnumber");
				int parking = input.nextInt();
				obj.deleteParking(floorNum, parking, "Empty");
				delete(floorNum ,parking);

			} else {
				go.doopration();
			}
		} catch (Exception e) {
			System.out.println("Enter correct option or cheak Wheather admin added floors");
			input.nextLine();
			access(obj);
		}
	}
	 private static String busNoValidate(String busno){
	     while(!busno.matches("^[A-Z|a-z]{2}\\s?[0-9]{1,2}\\s?[A-Z|a-z]{0,3}\\s?[0-9]{4}$")){
	         System.out.println("Input Mismatch, Re Enter Valid car Number: ");
	         busno=input.nextLine();
	     }
	     return busno;
	 }
	private static void delete(int floorNum, int parking) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getParkingFloor()==floorNum&&list.get(i).getParking_Number()==parking) {
				list.remove(i);
			}
		}
		
	}

}
