package Task_02;
import General_Work.DoublyLinkedList;
import General_Work.Link;
import General_Work.*;
///////////////////////////////////////////////////////////
public class Dequeue {
	int nElem;
	DoublyLinkedList link;
//////////////////////////////////////////////////////////
	public Dequeue() {	//Constructor
		nElem=0;
		link = new DoublyLinkedList();	}//end of constructor
/////////////////////////////////////////////////////////
	public boolean isEmpty() {
		return (nElem==0);	}
/////////////////////////////////////////////////////////
	public void enqueueLeft(String name, long dData) {
		link.insertFirst(name, dData);
		nElem++;	}//end of inserting form left side.
//////////////////////////////////////////////////////////
	public void enqueueRight(String name,long dData) {
		link.insertLast(name, dData);
		nElem++;	}//end of inserting form right side
//////////////////////////////////////////////////////////
	public Link dequeueLeft() {
		Link temp = link.removeFirst();
		nElem--;
		return temp;
	}//end of deleting form left side
/////////////////////////////////////////////////////////
	public Link dequeueRight() {
		Link temp = link.removeLast();
		nElem--;
		return temp;
	}//end of deleting from right side.
}//end of the Class.