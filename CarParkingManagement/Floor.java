package CarParkingManagement;


import java.util.ArrayList;
import java.util.Scanner;

public class Floor {
	static ArrayList<ArrayList<Object>> list = new ArrayList<>();

	static void display(ArrayList<ArrayList<Object>> array) {
		for (int j = 0; j < array.size(); j++) {
			System.out.println(array.get(j) + " ");
			System.out.println();
		}
	}

public static void addFloor(int noOfFloor) {
		Scanner input = new Scanner(System.in);
		try {
		int size = list.size();
		for (int i = size; i < noOfFloor + size; i++) {
			list.add(new ArrayList());
			System.out.println("How many parkings in Floor " + i);
			
			int parking = input.nextInt();
			
			for (int p = 0; p <= parking; p++) {
				String temp = ("Empty");
				list.get(i).add(temp);
			}
			
		}
		}catch(Exception e) {System.out.println("Illegal Entry");}
	}

	public void deleteFloor(int nextInt) {
		list.remove(nextInt);
		display(list);

	}

	public void addParking(int floorNum, int parking) {
		for (int i = 0; i < parking; i++) {
			list.get(floorNum).add("special" + i);

		}
		display(list);
	}

	public void updateParking(int floor, int num, Object str) {
		list.get(floor).set(num, str);
		display(list);
	}

	public void deleteParking(int floorNum, int parkingNum, Object str) {
		list.get(floorNum).set(parkingNum, str);
		display(list);
	}
}
