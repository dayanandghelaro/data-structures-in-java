package SingleEndedList;
//Person class..
public class Person {
	private String name;	//name of the person
	private String fathername;	//father's name of the person....
	private int age;	//age of the person..
	
	//Default constructor...
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	//user-defined constructor ...
	public Person(String name,String fathername, int age) {
		this.name = name; 
		this.fathername = fathername;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name: "+name+"\t Father's Name: "+fathername+"\t Age: "+age);
	}	
}
