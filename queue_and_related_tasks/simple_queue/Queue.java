package Task02;
import SingleEndedList.Link;
import SingleEndedList.LinkedListManipulation;
public class Queue {
	int n;
	LinkedListManipulation link;
////////////////////////////////////////	
	public Queue() {
		link = new LinkedListManipulation();
		n=0;
	}
///////////////////////////////////////////////	
	public boolean isEmpty() {
		return (n==0);
	}
/////////////////////////////////////////////////////////////////////////	
	public void enQueue(int id,String name, String fathername,int age) {
		System.out.println("Enqueue: ID: "+id+"\tName: "+name+"\tFather's Name: "+
	fathername+"\tAge: "+age);
		link.insertFirst(id, name, fathername, age);
		n++;
	}
//////////////////////////////////////////////////////////////////	
	public Link deQueue() {
		System.out.print("Dequeue: ");
		Link tem = link.deleteLast();
		tem.display();
		n--;
		return tem;
	}//end of deQueue method
}//end of class.
