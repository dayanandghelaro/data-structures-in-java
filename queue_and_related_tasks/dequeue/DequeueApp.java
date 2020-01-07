package DeQueue;
import java.util.*;
public class DequeueApp {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		char ch;
		System.out.println("System started successfully!\nEnter size of De-Queue: ");
		int size = input.nextInt();
		DequeueManipulation obj = new DequeueManipulation(size);
		do {
			System.out.println("Select option: \n1. Manipulate w.r.t Front\n"
					+ "2. Manipulate w.r.t Rear\n"
					+ "3. Show all Elements ");
			char opt = input.next().charAt(0);
			switch(opt) {
			case '1':
				obj.front();
				break;
			case '2':
				obj.rear();
				break;
			case '3':
				obj.show();
				break;
			default:
					System.out.println("Choose Correct Option.");
			}
			System.out.println("Continue (y/n): ");
			ch = input.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
		System.out.println("\nSystem ended successfully!");
	}//end of main method.
}//end of DequeueApp class.
