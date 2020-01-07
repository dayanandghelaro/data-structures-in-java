package Task_03;
import java.util.Scanner;

public class Towers_Of_Hanoi {
//-----------Attributes-----------//
	private static int nOfSteps = 0;
//---------------------------------//
private static void doTower(int nOfDisks, char source, char intermediate, char destination) {
	if(nOfDisks == 1)										//IF number of Disks become one
		System.out.println("Disk 1 form "+source+" to "+destination);	//THEN move disk one from source to destination
	else {																//ELSE 
		doTower(nOfDisks-1, source, destination, intermediate);			//recursively move disks from source to intermediate
		System.out.println("Disk "+nOfDisks+" from "+source+" to "+destination);
		doTower(nOfDisks-1, intermediate, source, destination);			//recursively move disks from intermediate to destination
	}

	++nOfSteps;				//count each step
}
//--------------------------------------------------------------------//
public static void main(String a[] ) {
	System.out.println("System started successfully! ");
	Scanner input = new Scanner(System.in);		//For getting data from user
	int nOfDisks;								//For number of disks
	System.out.println("Enter Number of disks : " );
	nOfDisks = input.nextInt();					//Get number of disks from user
	doTower(nOfDisks, 'A', 'B', 'C');			//call to doTower method to perform 
	System.out.println("\nNumber of Steps = "+nOfSteps);
	System.out.println("System ended successfully!");
}
//--------------------------------------------------------------------//
}//end of class
///////////////_END_OF_TOWERS_OF_HANOI_CLASS_//////////////////
