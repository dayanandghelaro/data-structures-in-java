package General_Work;

public class DoublyLinkedList {
	Link first;		//for access to first link
	Link last;		//for access to last link
////////////////////////////////////////////	
	public DoublyLinkedList() {
		first = null;
		last = null;
	}//end of constructor.
////////////////////////////////////////////
	public boolean isEmpty() {
		return (first==null);
	}//end of empty check.
////////////////////////////////////////////////////////
	public void insertFirst(String name,double dData) {
		Link newLink = new Link(name,dData);
		if(this.isEmpty())		//if link is empty
		{
			last = newLink;
			first = newLink;
		}
		else {
			first.previous = newLink;
			newLink.next = first;
			first = newLink;
		}//end of else
	}//end of inserting from first
/////////////////////////////////////////////////////////
	public void insertLast(String name,double dData) {
		Link newLink = new Link(name,dData);
		if(this.isEmpty()){
			first = newLink;
			last = newLink;
		}else {
			last.next = newLink;
			newLink.previous = last;
			last = newLink;
		}//end of else
	}//end of inserting last.
/////////////////////////////////////////////////////////
	public Link removeFirst() {
		Link temp = first;
		first = first.next;
//		first.previous = null;
		return temp;
	}//end of removing from first
////////////////////////////////////////////////////////	
	public Link removeLast() {
		Link temp = last;
		last = last.previous;
//		last.next = null;
		return temp;
	}//end of removing from last.
/////////////////////////////////////////////////////////
	public void insertBefore(double key, String name,double dData ) {
		Link newLink = new Link(name,dData);
		Link current = first;
		while((current.dData!=key)&&(current != null)) {
			current = current.next;
		}//end of while
		current.previous.next = newLink;
		newLink.previous = current.previous;
		newLink.next = current;
		current.previous = newLink;
	}//end of inserting before key
/////////////////////////////////////////////////////////
	public void insertAfter(double key,String name, double dData) {
		Link newLink = new Link(name,dData);
		Link current = first;
		while(current.dData!=key) {
			if(current == null)
				break;
			current = current.next;
		}//end of while
		current.next.previous = newLink;
		newLink.next = current.next;
		newLink.previous = current;
		current.next = newLink;
	}//end of inserting after key
/////////////////////////////////////////////////////////
	public Link removeBefore(double key) {
		Link current= first;
		while(current.dData!= key) {
			if(current == null)
				return null;
			else {
				current = current.next;
			}
		}//end of while loop.
		Link temp = current.previous;
		current.previous.previous.next= current;
		current.previous = current.previous.previous;
		return temp;
	}//end of removing before method.
/////////////////////////////////////////////////////////
	public Link removeAfter(double key) {
		Link current = first;
		while(current.dData!=key) {
			if(current == null) 
				return null;
			else
				current = current.next;
		}
		Link temp = current.next;
		current.next.next.previous = current;
		current.next = current.next.next;
		return temp;
	}//end of removing after key
/////////////////////////////////////////////////////////
	public Link delete(double key) {
		Link current = first;
		Link temp;
		while(current.dData!=key) {
			if(current == null)
				return null;
			current = current.next;
		}//end of while
		temp = current;
		current.previous.next = current.next;
		current.next.previous = current.previous;
		return temp;
	}//end of delete method.
/////////////////////////////////////////////////////////	
	public void displayForward() {
		Link current = first;	//starting from first link
		while(current!=null){	//go upto the last
			current.display();
			current = current.next;
		}//end of while
	}//end of diplay forward.
/////////////////////////////////////////////////////////
	public void displayBackward() {
		Link current = last;
		while(current!=null) {
			current.display();
			current = current.previous;
		}//end of while
	}//end of displaying backward.
/////////////////////////////////////////////////////////
	public void sortByNameInsertion(String name, double size) {
		Link cur = first;
		Link newLink = new Link(name,size);
		while((cur!=null)&&!(newLink.name.compareToIgnoreCase(cur.name)<=0)) {
			cur = cur.next;
		}
		if(cur==null)
			insertLast(newLink.name,newLink.dData);
		else
			insertBefore(cur.dData,newLink.getName(),newLink.getSize());
	}
}//end of class.
