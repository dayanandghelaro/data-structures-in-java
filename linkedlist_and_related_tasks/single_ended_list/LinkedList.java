package SingleEndedList;
public class LinkedList {
	Link first;
//////////////////////////////////////////	
	public LinkedList() {
		first = null;
	}//end of constructor
//////////////////////////////////////////	
	public boolean isEmpty() {
		return (first==null);
	}//end of empty.
/////////////////////////////////////////////////////////////////////////////	
	public void insertFirst(int id,String name,String fathername,int age) {
		Link newLink = new Link(id,name,fathername,age);
		newLink.next= first;
		first = newLink;
	}//end of insertFirst method.
/////////////////////////////////////////////////////////////////////////////
	public void insertLast(int id,String name, String fathername, int age) {
		Link cur=first;
		while(cur.next!=null) {
			cur = cur.next;
		}
		Link newLink = new Link(id,name,fathername,age);
		cur.next=newLink;
	}//end of insertLast
////////////////////////////////////////////////////////////////////////////	
	public Link deleteLast() {
		Link cur = first;
		Link pre = first;
		while(!(cur.next==null)) {
			pre = cur;
			cur = cur.next;
		}
		pre.next = cur.next;
		return cur;		
	}//end of delete Last
///////////////////////////////////////////	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		temp.next =null;
		return temp;
	}//end of deleteFirst method.
////////////////////////////////////////////	
	public Link find(int id) {
		Link current= first;
		while(current!=null&&current.getID()!=id) {
			current = current.next;
		}
		return current;
	}//end of find method.
//////////////////////////////////////////////////////
	public void insertBefore(int idd,int id,String name,String fname,int age) {
		Link pre=first;
		Link cur=first;
		while(cur.getID()!=idd) {
			if(cur.next==null)
				break;
			else {
				pre = cur;
				cur = cur.next;
			}//end of else
		}//end of loop
		Link newLink = new Link(id,name,fname,age); 
		newLink.next=cur;
		pre.next=newLink;
		System.out.print("Inserting ");
		newLink.display();
		System.out.print("before    ");
		cur.display();
	}//end of delete Before
/////////////////////////////////////////////////////////////////	
	public Link delete(int idd) {	//delete anywhere.
		Link pre=first;		//previous link
		Link cur= first;	//current link
		while(cur.getID()!=idd) {	//go upto the end if id is not found
			if(cur.next==null)
				return null;
			pre=cur;
			cur = cur.next;
		}
		if(pre==cur)
			first = cur.next;
		else
			pre.next = cur.next;
		return cur;
	}//end of delete.
/////////////////////////////////////////////////////////////////////////////	
	public void insertAfter(int idd,int id,String name,String fname,int age) {
		Link after=first;
		Link cur=first;
		while(cur.getID()!=idd) {
			if(cur.next==null)
				break;
			else {
				cur = cur.next;
				after = cur.next;
			}//end of else
		}//end of loop
		Link newLink = new Link(id,name,fname,age); 
		newLink.next=after;
		cur.next=newLink;
		System.out.print("Inserting ");
		newLink.display();
		System.out.print("after     ");
		cur.display();
	}//end of delete Before
////////////////////////////////////////////////////////////////////
	public void deleteList() {
		Link temp;
		System.out.println("deleting list");
		while(!this.isEmpty()) 
			temp = this.deleteFirst();			
	}//end of deleteList
//////////////////////////////////////////////////////////////////	
	public void displayList() {
		Link current=first;
		while(!this.isEmpty()) {
			if(current==null)
				break;
			current.display();
			current = current.next;
		}//end of while
		if(this.isEmpty())
			System.out.println("list is empty.");
	}//end of display list	
}//end of Linked List
