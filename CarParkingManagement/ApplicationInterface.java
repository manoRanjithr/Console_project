package CarParkingManagement;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class ApplicationInterface {
	public void doopration() {
	Scanner input = new Scanner(System.in);
	Floor floor = new Floor();
	Employee work = new Employee();

	try {
		System.out.println("ENTER \n1.Employee \n2.Admin\n3.Exit");
		byte option = input.nextByte();
		if (option > 3)
			throw new IOException();
		if(option==3)System.exit(0);;
		if (option == 1) {
			work.access(floor);
		}

		if (option == 2) {
			byte adminOption = 0;
			boolean flag = true;
			outer: while (true) {
				while (true) {
					System.out.println("1.ADD FLOOR\n2.DELETE FLOOR\n3.ADD PARKING\n4.displayParkings\n5.EXIT");
					adminOption = input.nextByte();
					if (adminOption == 1 || adminOption == 2 || adminOption == 3 || adminOption == 4||adminOption == 5) {
						break;
					} else {
						System.out.println("Enter valid Input");
					}
				}
				switch (adminOption) {
				case 1:
					System.out.println("ENTER HOW MANY FLOORS");
					floor.addFloor(input.nextInt());
					break;
				case 2:
					System.out.println("Enter the floor Number you want to delete");
					floor.deleteFloor(input.nextInt());
					break;
				case 3:
					System.out.println("ENTER THE FLOOR NUM");
					int floorNum = input.nextInt();
					System.out.println("how many parkings ypu want to add");
					int parking = input.nextInt();
					floor.addParking(floorNum, parking);
					break;
				case 4:
					   display();
					   break;
				case 5:
					doopration();
				default:
					doopration();
				}
			}
		}
	} catch (Exception e) {
		System.out.println("Invalid option");
		doopration();
	}

}
	void display(){
		ArrayList show=Employee.list;
		if(show.size()==0)System.out.println("There is no cars in the parkings");
		for(int i=0;i<show.size();i++) {
			
			CoustmerDetials  detials=(CoustmerDetials) show.get(i);
			if(detials.getCar_Number()!="Empty") {
			System.out.println("===================================================================");
			System.out.println("Coustemer Name            ="+detials.getName());
			System.out.println("Car NUmber                ="+detials.getCar_Number());
			System.out.println("parking Floor             ="+detials.getParkingFloor());
			System.out.println("parking Number            ="+detials.getParking_Number());
			System.out.println("===================================================================");
			}
		}
	}
}
