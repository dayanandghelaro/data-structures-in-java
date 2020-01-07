package SingleEndedList;
public class LinkedListApp {
	public static void main(String args[]) {
		LinkedListManipulation obj = new LinkedListManipulation();
		System.out.println("System started successfully!");
		obj.insertFirst(10, "Daya", "Darhoon", 19);
		obj.insertFirst(12, "Sajan", "Sakar", 20);
		obj.insertFirst(21, "Sham", "Chetan", 23);
		obj.displayList();
		obj.insertBefore(10, 11, "Fattah", "Hussain", 30);
		obj.displayList();
		obj.search(12);		
		obj.insertAfter(10, 23, "Ali", "Ahmed", 20);
		obj.deleteFirst();
		obj.displayList();
		obj.deleteList();
		obj.displayList();
		System.out.println("System ended Successfully!");
	}//end of main method.
}//end of class

