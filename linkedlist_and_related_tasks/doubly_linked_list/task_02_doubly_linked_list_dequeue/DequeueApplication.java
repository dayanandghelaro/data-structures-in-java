package Task_02;
import General_Work.*;
public class DequeueApplication {
	public static void main(String args[]) {
		System.out.println("System started successfully!");
		Dequeue obj = new Dequeue();
		obj.enqueueRight("Ather", 12);
		obj.enqueueRight("Ahmed", 15);
		obj.enqueueRight("Shah", 45);
		obj.enqueueLeft("Sham", 27);
		obj.enqueueLeft("Sajan", 17);
		obj.enqueueLeft("Suresh", 56);
		while(!obj.isEmpty()) {
			obj.dequeueRight().display();
		}//end of while.
		System.out.println("System ended successfully!");
	}//end of main method.
}//end of the application.
