package Task_03_Cafeteria;
import Task_01_Circular_Queue.Queue;
public class Cafe {
	public final int TIME=20;
	public static int time=0;
	Queue queue;
	int n;
/////////////////////////////////////
	public Cafe(int size) {
		queue= new Queue(size);
		n=0;
	}
/////////////////////////////////////////	
	public void placeOrder() {
		queue.enQueue(queue.getNElem());
	}
////////////////////////////////////////////////	
	public void printAllData() {
		System.out.println("Order number\t : Expected Waiting time");
		for(int i=0;i<queue.getNElem();i++) {
			System.out.println("\t"+(i+1)+"\t : \t"+time);
			time+=TIME;
		}//end of loop
	}//end of method.
}//end of Cafe.
