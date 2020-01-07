package SingleEndedList;

public class Link {
	private int id;
	private String name;	//name of the person
	private String fathername;	//father's name of the person....
	private int age;	//age of the person..
	Link next;
//////////////////////////////////////////////////////////////////
	public Link(int id,String name,String fathername, int age) { //constructor
		this.id = id;
		this.name = name; 
		this.fathername = fathername;
		this.age = age;
	}//end of constructor.
//////////////////////////////////////////////////////////////////	
	public int getID() {	//return id
		return this.id;
	}
///////////////////////////////////////////////////////////////	
	public void display() {	//display link
		System.out.println("ID : "+this.id+"\tName: "+name+"\t"
				+ " Father's Name: "+fathername+"\t Age: "+age);
	}	
//////////////////////////////////////////////////////////////	
}//end of Link
