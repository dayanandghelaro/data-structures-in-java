package Task_01_Circular_Queue;
public class QueueApp {
	public static void main(String args[]) {
		Queue obj = new Queue(10);
		obj.enQueue(10);
		obj.enQueue(20);
		obj.enQueue(30);
		obj.enQueue(40);
		
		obj.deQueue();
		obj.deQueue();
		obj.deQueue();
		
		obj.enQueue(50);
		obj.enQueue(60);
		obj.enQueue(70);
		obj.enQueue(80);
		
		while(!obj.isEmpty()) {
			int f= obj.deQueue();
			System.out.print(f+" ");
		}
	}//end of main method.
}//end of class.
