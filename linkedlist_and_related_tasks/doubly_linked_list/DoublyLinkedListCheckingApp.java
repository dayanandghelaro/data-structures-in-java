package General_Work;
public class DoublyLinkedListCheckingApp {
	public static void main(String args[]) {
		DoublyLinkedList obj = new DoublyLinkedList();
		System.out.println("System started successfully.");
		obj.insertFirst("Sajan", 15.1);		obj.insertFirst("Sham", 16.7);		obj.insertFirst("Daya", 17.6);
//		System.out.println("Displaying forward");
//		obj.displayForward();
		obj.insertLast("Sunil", 17);	obj.insertLast("Ans", 15.5);		obj.insertLast("Hafiz", 16.7);
//		System.out.println("Displaying backward");		
//		obj.displayBackward();
//		System.out.println("Removing form last: ");
//		obj.removeLast().display();
//		obj.removeLast().display();
/*		System.out.println("Removing from frist: ");
		obj.removeFirst().display();
		obj.removeFirst().display();
		System.out.println("Remaining elements after removing 2 elements from both sides.");
		obj.displayBackward();*/		
/*		System.out.println("Deleting 15.5 ");
		obj.delete(15.5).display();
		System.out.println("Remaining ");
		obj.displayForward();*/		
		System.out.println("Displaying forward");		obj.displayForward();
		System.out.println("Inserting after  17 ");		obj.insertAfter(17, "Noor", 12);
		System.out.println("Inserting before 17 ");		obj.insertBefore(17, "Ali", 09.9);
		System.out.println("Now ");		obj.displayForward();
		obj.removeBefore(17);		obj.removeAfter(17);
		System.out.println("After removing before 17 ");
		obj.displayForward();
		System.out.println("System ended successfully!");
	}//end of main method.
}//end of class.
