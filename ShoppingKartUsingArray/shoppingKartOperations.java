package shoppingKartusingArray;

import java.util.Scanner;

//this class is for main menu

public class shoppingKartOperations {
	static Scanner sc=new Scanner(System.in);

	//this method listed all menus
	static void AllOPerations()
	{
		int choice;
		System.out.println("\t~Welcome To Shopping Kart~");
	    while(true) {
			System.out.println("========================================");
			System.out.println("Enter 1. for Admin Panal\n"
					+ "Enter 2. for User Panel\n"
					+ "Enter 3.for Quit");
			
			System.out.println("========================================");
			choice=sc.nextInt();
			System.out.println("========================================");

switch(choice) {
case 1: 
	AdminAndUserPanel.adminPanel();
	System.out.println("========================================");
    break;

case 2:
	AdminAndUserPanel.userPanel();
	System.out.println("========================================");
    break;
    
case 3:
	System.exit(0);

	
}
	    }
	
	
	
	}

}
