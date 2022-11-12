package view;

import controller.AdminController;


public class ApplictionInterface {
	static{
		AdminController.addFlight(1234,"chennai","pattukkottai","11.00",20);
	}
static App app=new App();
	public static void main(String[] args) {
		App.clickOption();
	}
}
