package Task_04;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Link {
//------------Attributes----------//
	public int id;		//to store id i.e (IP Address etc)
	public Link next;	//for linkage
//--------------------------------//
	public Link(int id) {	//constructor
		this.id=id;			//SET id
	}
//-------------Setter-------------//
	void setID(int id) {
		this.id=id;
	}
//-------------Getter-------------//
	int getID(int id) {
		return this.id;
	}
//--------------------------------//
	void dispalyLink() {		//Display Node OR ID OR IP_Address
		System.out.println("Node "+this.id+" : ");
	}
}
/////////////_END_OF_LINK_CLASS_///////////////
class LinkedList {
//-----------Attributes--------------//
	private Link first;				//Link to first node/link/IP
	private Link last;				//Link to last Link
	private int nOfAddresses;			//length or size or number of links
	private int receiverID, senderID;	//IP addresses of sender and receiver
	
	InputStreamReader streamReader = new InputStreamReader(System.in);
	BufferedReader bufferedReader = new BufferedReader(streamReader);
	String message = "";
//-------Constructor----------------//
public LinkedList() {
	first = null;			//Initially no link
	last = null;
	nOfAddresses = 0;
}
//----------------------------------//
public int getSize() {
	return nOfAddresses;
}
//----------------------------------//
public boolean isEmpty() {
	return (nOfAddresses == 0);
}
//----------------------------------//
public void insert(int Id) {
	Link newLink = new Link(Id);		//create newLink for new IP address
	if(this.isEmpty()) {				//IF it's Initially or at first insertion
		first = newLink;				//THEN SET first and last link that are same
		last = newLink;	
		last.next = first;				//circularly link last with first too.
	}
	else {								//ELSE 
		newLink.next = first;			//SET newLink before first 
		first = newLink;				//connect/link last with new first
		last.next = first;
	}
	nOfAddresses++;						//count new number of address added
}
//----------------------------------//
public void display() {
	Link current = first;		//Start from first node/IP/Link
	boolean counter = false;	//for busy users
	if(this.isEmpty())			//IF Link is empty THEN print message
		System.out.println("Circular Linked List is Empty.");
	else {						//ELSE do following process
		for(int i = 0, j = 0; i<nOfAddresses; i++) {		//Do till All Addresses of circular linked list
			System.out.println("\n -----Iteration 0"+(i+1)+"------");
			while(j<nOfAddresses) {
				try {
					j ++;
					current.dispalyLink();
					if(current.id == receiverID) {
						message = "";
						receiverID = 0;
					}
					//setting time limit for 10 seconds
					double seconds = System.currentTimeMillis() + 1000*10;
					while(System.currentTimeMillis()<seconds){		//wait for 10 seconds
						if(bufferedReader.ready()) {				//during wait
							message += bufferedReader.readLine();	//get user entered message
							if(message != null) {					//IF message is not entered
								senderID = current.id;				//THEN note current id as sender's id
								receiverID = Integer.parseInt(message.substring(0, 4));//get receiver's id from message
								message = message.substring(5, message.length());//SET message without receiver's id
								System.out.println("Message sent to "+receiverID);//Show message
								counter = true;	//true for next busy user									
							}//end of nested-if
						}//end of outer if
					} //end of nested-while loop
					if(counter == true) {		//IF user busy
						current = current.next;	//move to other in circular linked list
						continue;
					}
					
					else if( message == "")
						System.out.println(); 
					else if(message != null)			//IF message not entered THEN
						System.out.println("\n[Busy]");	//show busy
					current=current.next;
				} 
				catch(Exception e) {
					System.out.println();
				}//end of catch
			}//end outer while
		} //end of for loop	
	} //end of else
}
}
/////////////_END_OF_LINKED_LIST_CLASS_////////////////
