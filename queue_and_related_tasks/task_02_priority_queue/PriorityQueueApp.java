package Task_02_Priority_Queue;
public class PriorityQueueApp {
	public static void main(String args[]) {
		System.out.println("System started successfully");
		PriorityQueue obj = new PriorityQueue(10);
		obj.enQueue(10);
		obj.enQueue(7);
		obj.enQueue(12);
		obj.enQueue(9);
		
		obj.deQueue();
		
		obj.enQueue(5);
		obj.enQueue(-5);
		
		while(!obj.isEmpty()) {
			System.out.print(obj.deQueue()+" ");
		}
	}//end of main method.
}//end of class.
