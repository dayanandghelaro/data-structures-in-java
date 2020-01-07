package Task01;
public class StackApp {
	public static void main(String args[]) {
		System.out.println("System started successfully!");
		StackUse stck = new StackUse();
		stck.push(23, "Ahmed", "Ali", 12);
		stck.push(2, "Daya", "Darhoon", 19);
		stck.push(3, "Sham", "Sunder", 20);
		stck.push(5, "Deewan", "Darshan", 25);
		stck.push(7, "Abdullah", "Ali", 55);
		System.out.println("Poping ");
		stck.pop();
		stck.popAll();
		
		System.out.println("System ended successfully!");
	}//end of main method.
}//end of class.
