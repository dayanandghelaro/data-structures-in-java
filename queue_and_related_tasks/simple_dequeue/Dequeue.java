package Dequeue;
import SingleEndedList.Link;
import SingleEndedList.LinkedListManipulation;
public class Dequeue {
	int nElem;
	LinkedListManipulation link;
///////////////////////////////////////////////	
	public Dequeue() {	//constructor
		nElem=0;
		link = new LinkedListManipulation(); }//end of constructor
/////////////////////////////////////////////////
	public boolean isEmpty() {	return(nElem==0);	}//end of isEmpty.
//////////////////////////////////////////////////	
	public void enqueueFromFirst(int id,String name,String fathername,int age) {
		link.insertFirst(id, name, fathername, age);
		nElem++;
	}//end of inserting from first
//////////////////////////////////////////////////////////	
	public Link dequeueFromFirst() {
		Link delete =link.deleteFirst();
		nElem--;
		return delete;
	}//end of deleting from first.
///////////////////////////////////////////////////////////////	
	public void enqueueFromLast(int id,String name,String fathername,int age) {
		link.insertLast(id, name, fathername, age);
		nElem++;	}//end of inserting from last..
////////////////////////////////////////////////////////////////	
	public Link dequeueFromLast() {
		Link delete=link.deleteLast();
		nElem--;
		return delete;	}//end of deleting from last.
////////////////////////////////////////////////////////////////	
	public int getNofElem() {		return nElem;	}
}//end of Dequeue class.
