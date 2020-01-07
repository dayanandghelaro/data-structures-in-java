package Task01;
import SingleEndedList.Link;
public class StackUse {
	Stack obj;
//////////////////////////////
	public StackUse() {
		obj = new Stack();
	}
/////////////////////////////////////////////////////////////////	
	public void push(int id,String name,String fname,int age) {
		System.out.println("Push:\tID : "+id+"\tName: "+name+"\tFather's Name: "+fname+"\tAge: "+age);
		obj.push(id, name, fname, age);
	}
///////////////////////////////////////////////////////////////	
	public void pop() {
		if(!obj.isEmpty()) {
			Link link = obj.pop();
			System.out.print("Poped:\t");
			link.display();
		}else
			System.out.println("Stack is Empty..");
	}
//////////////////////////////////////////////////////////////	
	public void popAll() {
		while(!obj.isEmpty()) {
			Link link = obj.pop();
			System.out.print("Poped:\t");
			link.display();			
		}
	}//end of popAll method.
}//end of the class.
