package Task03;
import SingleEndedList.LinkedListManipulation;
public class DeleteAnywhereLink {
	public static void main(String args[]) {
		System.out.println("System started successfully!");
		LinkedListManipulation obj = new LinkedListManipulation();
		obj.insertFirst(10, "Daya", "Darhoon", 19);
		obj.insertFirst(12, "Sajan", "Sakar", 20);
		obj.insertFirst(21, "Sham", "Chetan", 23);
		obj.displayList();
		obj.insertBefore(10, 11, "Fattah", "Hussain", 30);
		obj.insertAfter(10, 23, "Ali", "Ahmed", 20);
		obj.displayList();
		obj.deleteAnyWhere(21);
		obj.displayList();
		obj.deleteAnyWhere(124);
		obj.displayList();		
		
		System.out.println("System ended successfully!");
	}
}
