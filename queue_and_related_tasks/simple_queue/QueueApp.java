package Task02;

public class QueueApp {
	public static void main(String args[]) {
		Queue obj = new Queue();
		obj.enQueue(12, "Shakeel", "Ahmed", 23);
		obj.enQueue(2, "Sham", "Sunder", 19);
		obj.enQueue(124, "Abdullah", "Ali",13);
		obj.enQueue(16, "Ali", "Shah", 21);
		obj.enQueue(5, "Sajan", "Das", 25);
		System.out.println("\n");
		obj.deQueue();
		System.out.println("\n");
		while(!obj.isEmpty()) {
			obj.deQueue();
		}
	}//end of main method.
}//end of the class.
