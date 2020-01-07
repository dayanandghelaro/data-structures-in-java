package Task_01_A;

import java.util.Scanner;

import Task_01_B.BinarySearchDescending;

public class BinaryApp {
	public static void main(String args[]) {
		System.out.println("System started successfully!");
		Scanner input = new Scanner (System.in);
		BinarySearch obj = new BinarySearch(10);
		for(int j=1;j<=10;j++) {
			obj.insert(j*9);
		}
		char c;
		obj.show();
		do {
			System.out.println("Enter any number to search: ");
			int num = input.nextInt();
			obj.binarySearch(num);
			System.out.println("Do you want to search again (y/n): ");
			c = input.next().charAt(0);
		}while(c!='n'||c!='N');
		System.out.println("\nSystem ended Successfully!");
	}//end of main method.

}//end of App class.
