package General_Work;

public class Link {
	double dData;	//float data
	String name;	//String data
	Link next;		//Connection for next link
	Link previous;	//Connection for previous link
/////////////////////////////////////////////////////	
	public Link(String name,double dData) {	//Constructor
		this.name = name;		//String data stored
		this.dData = dData;		//float data stored
	}//end of constructor.
/////////////////////////////////////////////////////
	public String getName() {
		return this.name;
	}
/////////////////////////////////////////////////////
	public double getSize() {
		return this.dData;
	}
/////////////////////////////////////////////////////////	
	public void display() {		//Display data of current link
		System.out.println("Name : "+name+"\tScore : "+dData);
	}//end of display method.
/////////////////////////////////////////////////////
}//end of Link class.
