package DeQueue;
import java.util.*;
public class DequeueManipulation {
	Dequeue dequeue;
	Scanner input = new Scanner(System.in);
//////////////////////////////////////////////////////////////////////	
	public DequeueManipulation(int size) {
		dequeue = new Dequeue(size);
	}//end of constructor.
/////////////////////////////////////////////////////////////////////	
	public void front() {
		char ch;
		System.out.println("Select Option: \n1. EnQueue\n2. DeQueue");
		ch = input.next().charAt(0);
		switch(ch) {
		case '1':
			if(!dequeue.isFull()) {
				System.out.println("Enter number: ");
				int num = input.nextInt();
				dequeue.enQueueFromFront(num);
			}else
				System.out.println("DeQueue is full!");
			break;
		case '2':
			if(!dequeue.isEmpty()) {
				System.out.println(dequeue.deQueueFromFront());
			}else
				System.out.println("DeQueue is empty.");
			break;
		default:
			System.out.println("Select right choice.");
		}
	}//end of front.
///////////////////////////////////////////////////////////////////////	
	public void rear() {
		char ch;
		System.out.println("Select Option: \n1. EnQueue\n2. DeQueue");
		ch = input.next().charAt(0);
		switch(ch) {
		case '1':
			if(!dequeue.isFull()) {
				System.out.println("Enter number: ");
				int num = input.nextInt();
				dequeue.enQueueFromRear(num);
			}else
				System.out.println("DeQueue is full!");
			break;
		case '2':
			if(!dequeue.isEmpty()) {
				System.out.println(dequeue.deQueueFromRear());
			}else
				System.out.println("DeQueue is empty.");
			break;			
		default:
			System.out.println("Select right choice.");
		}
	}//end of front.
//////////////////////////////////////////////////////////////
	public void show() {
		if(!dequeue.isEmpty())
			dequeue.display();
		else
			System.out.println("DeQueue is empty.");
	}
}//end of class.
