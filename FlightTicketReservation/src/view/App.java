package view;

import java.util.Scanner;

import model.DataBase;

public class App {
	 static userView user=new userView ();
	 static AdminView admin=new  AdminView();
	 static Scanner input=new Scanner(System.in);

	public static void clickOption() {
		outer:while(true) 
		{  
			try
		{
			System.out.println("Enter Your option \n1.User\n2.Admin ");
		    byte option =input.nextByte();
		    switch(option)
		    {
		    case 1:
		        opration();
		    	break;
		    case 2:
		    	admin.adminOption();
                 break;
		    case 3:
		    	break outer;
		    }
		}catch(Exception e) {break outer;};
	}
	}
	private static void opration() {
		{ try
		{
			System.out.println("Enter Your option \n1.login  \n2.signup");
		    byte option =input.nextByte();
		    switch(option)
		    {
		    case 1:
		        userView.login();
		    	break;
		    case 2:
		    	userView.signUp();
                 break;
		    case 3:
		    	break ;
		    
		}
		}catch(Exception e) {System.out.println("Enter valid crendials");};
		}
	}
}

