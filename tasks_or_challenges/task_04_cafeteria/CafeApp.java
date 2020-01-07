package Task_03_Cafeteria;

public class CafeApp {
	public static void main(String args[]) {
		System.out.println("System started successfully!");
		Cafe obj = new Cafe(10);
		obj.placeOrder();
		obj.placeOrder();
		obj.placeOrder();
		obj.placeOrder();
		obj.printAllData();
		System.out.println("System ended successfully!");
	}//end of main method.
}//end of class
