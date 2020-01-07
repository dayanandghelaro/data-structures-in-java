package Task_02;
import java.util.*;
public class FibonacchiSeriesApp {
	public static void main(String args[]) {
		System.out.println("System started successfully!");
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number of terms of Fibonacci series: ");
		int size = input.nextInt();
		FibonacciSeries obj = new FibonacciSeries(size);
		System.out.print("For Fibonacci Series provide:\nFirst Number: ");
		int num1 = input.nextInt();
		System.out.print("2nd number: ");
		int num2 = input.nextInt();
		obj.series(num1, num2);		
		System.out.println("System ended successfully!");
	}//end of main method.
}//end of App class.
