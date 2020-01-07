package Dequeue;
import java.util.*;
public class DequeueApp {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("System started successfully!");
		Dequeue obj = new Dequeue();
		//inserting from first
		obj.enqueueFromFirst(12, "Fattah", "Thebo", 23);
		obj.enqueueFromFirst(43, "Ali", "Ahmed", 45);
		obj.enqueueFromFirst(87, "Ram", "Raj", 19);
		//inserting from last
		obj.enqueueFromLast(45, "Raja", "Raichand", 18);
		obj.enqueueFromLast(76, "Sham", "Chetan", 23);
		obj.enqueueFromLast(98, "Sajan", "Sakar", 20);
		//deleteing from first
		obj.dequeueFromFirst().display();
		obj.dequeueFromFirst().display();
		//deleting from last
		obj.dequeueFromLast().display();
		obj.dequeueFromLast().display();
		
		System.out.println("System ended successfully!");
	}//end of main method...

}//end of DequeueApp class.
