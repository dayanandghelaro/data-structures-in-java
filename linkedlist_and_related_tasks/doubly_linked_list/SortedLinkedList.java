package General_Work;

public class SortedLinkedList {
	Link first;
///////////////////////////////	
	public SortedLinkedList() {
		first=null;
	}
///////////////////////////////	
	public boolean isEmpty() {
		return (first==null);
	}
/////////////////////////////////////////////////////////////////	
	public void insertSortingByNumber(String name,double Data) {
		Link newLink = new Link(name,Data);
		Link previous = null;
		Link current = first;
		while((current!=null)&&(current.dData<Data)) {
			previous = current;
			current = current.next;
		}
		if(previous==null)
			first = newLink;
		else
			previous.next = newLink;
		newLink.next = current;
	}
/////////////////////////////////////////////////////////////////	
	public void insertSortingByName(String name,double Data) {
		Link newLink = new Link(name,Data);
		Link previous = null;
		Link current = first;
		while((current!=null)&&(current.name.compareToIgnoreCase(name)<0)) {
			previous = current;
			current = current.next;
		}
		if(previous == null)
			first = newLink;
		else
			previous.next = newLink;
		newLink.next = current;
	}
//////////////////////////////////////////	
	public Link remove() {
		Link temp = first;
		first = first.next;
		return temp;
	}
//////////////////////////////////////////	
	public void displayLink() {
		Link cur=first;
		while(cur!=null) {
			cur.display();
			cur = cur.next;
		}
	}//end of method.
}//end of sorted linked list class.
