package Task01;
import SingleEndedList.Link;
import SingleEndedList.LinkedListManipulation;
//import SingleEndedList.LinkedList;
public class Stack {
	LinkedListManipulation link = new LinkedListManipulation();
	int nElem;
//////////////////////////////////////////////////////////////
	public Stack() {
		nElem=0;
	}
///////////////////////////////////////////////////////////////	
	public void push(int id,String name,String fname,int age) {
		link.insertFirst(id, name, fname, age);
		nElem++;
	}
////////////////////////////////////////////////////////////	
	public Link pop() {
		nElem--;
		return link.deleteFirst();
	}
////////////////////////////////////////////////////////////	
	public boolean isEmpty() {
		return (nElem==0);
	}
}//end of class.
