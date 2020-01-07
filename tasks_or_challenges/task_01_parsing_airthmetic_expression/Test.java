package ParsingAirthmeticExpression;
import java.util.*;
public class Test {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("System started successfully!");
		System.out.println("Enter exp: ");
		String str;
		str = input.nextLine();
		PostFix obj = new PostFix(str);//a+(d*x-y)/w-s*r
		obj.doPost();
		System.out.println("Post fix : "+obj.getPost());
		System.out.println("System ended successfully!");
	}//end of main method.
}//end of the class.
